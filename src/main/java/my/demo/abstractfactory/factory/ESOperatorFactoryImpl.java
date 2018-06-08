package my.demo.abstractfactory.factory;

import my.demo.abstractfactory.model.criteria.ESQueryBuilder;
import my.demo.abstractfactory.operator.Operator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ESOperatorFactoryImpl extends BaseOperatorFactory<ESQueryBuilder> {
    public ESOperatorFactoryImpl(List<Operator<ESQueryBuilder>> operators) {
        super(operators);
    }
}
