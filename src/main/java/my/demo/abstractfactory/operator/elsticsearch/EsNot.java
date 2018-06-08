package my.demo.abstractfactory.operator.elsticsearch;

import my.demo.abstractfactory.model.criteria.ESQueryBuilder;
import my.demo.abstractfactory.operator.Not;
import org.springframework.stereotype.Component;

@Component
public class EsNot implements Not<ESQueryBuilder>{

    @Override
    public ESQueryBuilder parse(String value) {
        return ESQueryBuilder.builder().searchParam(getSearchParam(value)).build();
    }

    private String getSearchParam(String value) {
        return getType().getValue() + " " + value;
    }
}
