package hr.inovatrend.petManager.Entities;


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

    private String name;
    private Integer height;
    private Integer weight;
    private Integer age;

    @Embedded
    private Adoptable adoptable;

    @Embedded
    private Valued valued;


}