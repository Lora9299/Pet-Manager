package hr.inovatrend.petManager.Entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "animals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonManagedReference

    private User user;

    private String name;
    private Integer height;
    private Integer weight;
    private Integer age;
    private AnimalType animal;

    @Embedded
    private Adoptable adoptable;

    @Embedded
    private Valued valued;

}
