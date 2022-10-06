package hr.inovatrend.petManager.Entities;

import lombok.Getter;

@Getter
public enum AnimalType {
    CAT("Cat"),
    DOG("Dog"),
    RODENT("Rodent"),
    FISH("Fish"),
    BIRD("Bird"),
    REPTILE("Reptile");

    private final String displayValue;

    AnimalType(String displayValue){

        this.displayValue = displayValue;

    }

}
