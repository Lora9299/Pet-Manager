package hr.inovatrend.petManager.Specifications;

import hr.inovatrend.petManager.Entities.Animal;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@AllArgsConstructor
public class AnimalSpecification implements Specification<Animal> {

private SearchCriteria search;

    @Override
    public Predicate toPredicate
            (Root<Animal> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        if (search.getOperation().equalsIgnoreCase(">")) {
            return builder.greaterThanOrEqualTo(
                    root.<String> get(search.getKey()), search.getValue().toString());
        }
        else if (search.getOperation().equalsIgnoreCase("<")) {
            return builder.lessThanOrEqualTo(
                    root.<String> get(search.getKey()), search.getValue().toString());
        }
        else if (search.getOperation().equalsIgnoreCase(":")) {

                return builder.equal(root.get(search.getKey()), search.getValue());

        }
        return null;
    }
}
