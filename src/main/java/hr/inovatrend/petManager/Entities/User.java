package hr.inovatrend.petManager.Entities;

import lombok.*;

import javax.persistence.*;

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

    private String name;
    private String surname;
    private String OIB;

    @Column(unique=true)
    private String email;

    @Embedded
    private Address address;

    private String password;

}
