package hr.inovatrend.petManager.Entities.Enums;

import lombok.Getter;

@Getter
public enum Operators {

    LESS("<"),
    GREATER(">"),
    EQUAL("=");

    private final String displayValue;

    Operators(String displayValue){

        this.displayValue = displayValue;

    }

}
