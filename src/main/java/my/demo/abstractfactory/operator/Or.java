package my.demo.abstractfactory.operator;

public interface Or<V> extends Operator<V> {

    @Override
    default FilterOperator getType() {
        return FilterOperator.OR;
    }
}
