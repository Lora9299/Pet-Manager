package hr.inovatrend.petManager.Entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Valued {

    private Long price;
    private Boolean shippable;

}
