package hr.inovatrend.petManager.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;


    @JsonBackReference
    @OneToMany (mappedBy = "user")

    List<Animal> animals = new ArrayList<>();

    private String name;
    private String surname;
    private String oib;

    @Column(unique=true)
    private String email;

    @Embedded
    private Address address;

    private String password;

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

}
