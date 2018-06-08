package my.demo.abstractfactory.operator.jpa;

import my.demo.abstractfactory.model.criteria.JPASpecification;
import my.demo.abstractfactory.operator.And;
import org.springframework.stereotype.Component;

@Component
public class JpaAnd implements And<JPASpecification> {
    @Override
    public JPASpecification parse(String value) {
        return JPASpecification.builder().searchParam(getSearchParam(value)).build();
    }

    private String getSearchParam(String value) {
        return getType().getValue() + " " + value;
    }
}
