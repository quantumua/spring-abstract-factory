package my.demo.abstractfactory.operator;

public interface And<V> extends Operator<V>{
    @Override
    default FilterOperator getType() {
        return FilterOperator.AND;
    }
}
