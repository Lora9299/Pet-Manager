package hr.inovatrend.petManager.Entities;

import hr.inovatrend.petManager.Entities.Enums.Operators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultAnimal {



    private Operators operatorHeight;
    private Operators operatorWeight;
    private Operators operatorAge;
    private Operators operatorValued;
    private String name;
    private Integer height;
    private Integer weight;
    private Integer age;
    private AnimalType animal;

    @Embedded
    private Valued valued;

}
