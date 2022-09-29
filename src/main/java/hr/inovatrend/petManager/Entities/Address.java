package hr.inovatrend.petManager.Entities;

import javax.persistence.*;

@Embeddable
public class Address {

    private String streetName;
    private String streetNumber;
    private String country;
    private String city;
    private String zip;

}
