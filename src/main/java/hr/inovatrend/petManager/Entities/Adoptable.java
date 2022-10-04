package hr.inovatrend.petManager.Entities;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.Date;

@Getter
@Setter
@Embeddable
public class Adoptable {

    private Boolean adoptable;
    private Date adoptionDate;
    private String info; //info about previous owners/breeders or where the animal was found if it's stray

}
