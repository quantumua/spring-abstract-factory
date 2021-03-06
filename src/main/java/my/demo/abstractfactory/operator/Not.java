package my.demo.abstractfactory.operator;

public interface Not<V> extends Operator<V>{
    @Override
    default FilterOperator getType() {
        return FilterOperator.NOT;
    }
}
