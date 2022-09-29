package hr.inovatrend.petManager.Entities;

import lombok.*;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String streetName;
    private String streetNumber;
    private String country;
    private String city;
    private String zip;

}
