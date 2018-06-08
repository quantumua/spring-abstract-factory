package my.demo.abstractfactory;

import my.demo.abstractfactory.factory.ESOperatorFactoryImpl;
import my.demo.abstractfactory.factory.OperatorFactory;
import my.demo.abstractfactory.model.criteria.ESQueryBuilder;
import my.demo.abstractfactory.model.criteria.JPASpecification;
import my.demo.abstractfactory.operator.FilterOperator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.ResolvableType;

@SpringBootApplication
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AbstractFactoryApplication.class, args);
		String[] beanNamesForType1 = ctx.getBeanNamesForType(ResolvableType.forClassWithGenerics(OperatorFactory.class, ESQueryBuilder.class));

// If you expect several beans of the same generic type then extract them as you wish. Otherwise, just take the first
		OperatorFactory<ESQueryBuilder> esOperatorfactory = (OperatorFactory<ESQueryBuilder>) ctx.getBean(beanNamesForType1[0]);
		ESQueryBuilder anyKey1 = (ESQueryBuilder)esOperatorfactory.getOperator(FilterOperator.AND).parse("AnyKey");
		System.out.println(anyKey1.getQuery());

		String[] beanNamesForType2 = ctx.getBeanNamesForType(ResolvableType.forClassWithGenerics(OperatorFactory.class, JPASpecification.class));

// If you expect several beans of the same generic type then extract them as you wish. Otherwise, just take the first
		OperatorFactory<JPASpecification> jpaSpecificationOperatorFactory = (OperatorFactory<JPASpecification>) ctx.getBean(beanNamesForType2[0]);
		JPASpecification anyKey2 = (JPASpecification)jpaSpecificationOperatorFactory.getOperator(FilterOperator.OR).parse("AnyKey");
		System.out.println(anyKey2.getQuery());
	}

}
