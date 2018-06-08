package my.demo.abstractfactory.factory;

import my.demo.abstractfactory.operator.FilterOperator;
import my.demo.abstractfactory.operator.Operator;
import my.demo.abstractfactory.storagemarker.StorageTypeAware;

public interface OperatorFactory<V> {
    Operator getOperator(FilterOperator type);
}
