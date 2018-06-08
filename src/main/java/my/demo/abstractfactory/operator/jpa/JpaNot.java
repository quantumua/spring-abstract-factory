package my.demo.abstractfactory.operator.jpa;

import my.demo.abstractfactory.model.criteria.JPASpecification;
import my.demo.abstractfactory.operator.Not;
import org.springframework.stereotype.Component;

@Component
public class JpaNot implements Not<JPASpecification> {
    @Override
    public JPASpecification parse(String value) {
        return JPASpecification.builder().searchParam(getSearchParam(value)).build();
    }

    private String getSearchParam(String value) {
        return getType().getValue() + " " + value;
    }
}
