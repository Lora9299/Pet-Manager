package hr.inovatrend.petManager.Specifications;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class SearchCriteria {

    private String key;
    private String operation;
    private Object value;

    public boolean isOrPredicate() {
        return false;
    }
}
