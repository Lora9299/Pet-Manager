package hr.inovatrend.petManager.Specification.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchCriteria {
	private String key;
	private String operation;
	private Object value;
	public boolean orPredicate;

	public SearchCriteria(String key, String operation, Object value) {
		this.key = key;
		this.operation = operation;
		this.value = value;
	}

	public boolean isOrPredicate() {
		return orPredicate;
	}
}
