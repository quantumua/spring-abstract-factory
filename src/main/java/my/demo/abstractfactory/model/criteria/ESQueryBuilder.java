package my.demo.abstractfactory.model.criteria;

import lombok.Builder;
import lombok.Getter;
@Builder
public class ESQueryBuilder {
    @Getter
//    @Builder.Default
    private String type;
    @Getter
    private String searchParam;

    public static class ESQueryBuilderBuilder {
        private String type = ESQueryBuilder.class.getSimpleName();
    }

    public String getQuery(){
        return getType() + "( " + getSearchParam() + " )";
    }
}
