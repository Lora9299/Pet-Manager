package hr.inovatrend.petManager.Entities;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Embeddable;
import java.util.Date;

@Getter
@Setter
@Embeddable
public class Adoptable {




    private Boolean isAdoptable;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date adoptionDate;
    private String info; //info about previous owners/breeders or where the animal was found if it's stray

}
