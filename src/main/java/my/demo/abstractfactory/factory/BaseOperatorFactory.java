package my.demo.abstractfactory.factory;

import my.demo.abstractfactory.operator.FilterOperator;
import my.demo.abstractfactory.operator.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

public abstract class BaseOperatorFactory<V> implements OperatorFactory<V> {

    private Map<FilterOperator, Operator<V>> operators;

    @Autowired
    public BaseOperatorFactory(List<Operator<V>> operators) {
        this.operators = operators.stream()
                .collect(Collectors.toMap(Operator::getType, identity()));
        checkConsistency();
    }

    private void checkConsistency() {
        Arrays.stream(FilterOperator.values())
                .forEach(filter -> Assert.notNull(operators.get(filter), () -> String.format("Please implement %s operator", filter.getValue())));
    }

    @Override
    public Operator getOperator(FilterOperator type) {
        return operators.get(type);
    }
}
