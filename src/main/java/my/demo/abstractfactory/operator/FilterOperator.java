package my.demo.abstractfactory.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FilterOperator {
    AND("AND"),
    OR("OR"),
    NOT("NOT");
    @Getter
    private String value;
}
