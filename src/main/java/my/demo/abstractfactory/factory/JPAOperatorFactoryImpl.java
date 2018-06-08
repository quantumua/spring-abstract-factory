package my.demo.abstractfactory.factory;

import my.demo.abstractfactory.model.criteria.JPASpecification;
import my.demo.abstractfactory.operator.Operator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JPAOperatorFactoryImpl extends BaseOperatorFactory<JPASpecification> {
    public JPAOperatorFactoryImpl(List<Operator<JPASpecification>> operators) {
        super(operators);
    }
}
