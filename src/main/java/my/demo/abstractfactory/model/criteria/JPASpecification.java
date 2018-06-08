package my.demo.abstractfactory.model.criteria;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JPASpecification {

@Builder.Default
    String type = JPASpecification.class.getSimpleName();

    private String searchParam;

    public String getQuery() {
        return getType() + "( " + getSearchParam() + " )";
    }
}
