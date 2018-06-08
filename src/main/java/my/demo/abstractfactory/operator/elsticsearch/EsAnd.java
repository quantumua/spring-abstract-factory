package my.demo.abstractfactory.operator.elsticsearch;

import my.demo.abstractfactory.model.criteria.ESQueryBuilder;
import my.demo.abstractfactory.operator.And;
import org.springframework.stereotype.Component;

@Component
public class EsAnd implements And<ESQueryBuilder> {
    @Override
    public ESQueryBuilder parse(String value) {
        return ESQueryBuilder.builder().searchParam(getSearchParam(value)).build();
    }

    private String getSearchParam(String value) {
        return getType().getValue() + " " + value;
    }
}
