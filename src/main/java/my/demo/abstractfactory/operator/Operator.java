package my.demo.abstractfactory.operator;

public interface Operator<V> {
    FilterOperator getType();
    V parse(String value);
}
