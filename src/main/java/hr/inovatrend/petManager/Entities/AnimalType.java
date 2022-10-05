package hr.inovatrend.petManager.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

public enum AnimalType {
    CAT("Cat"),
    DOG("Dog"),
    RODENT("Rodent"),
    FISH("Fish"),
    BIRD("Bird"),
    REPTILE("Reptile");

    private final String animal;

    AnimalType(String animal) {

        this.animal = animal;
    }
}
