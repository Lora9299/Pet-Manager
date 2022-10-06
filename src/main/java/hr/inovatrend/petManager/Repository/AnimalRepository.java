package hr.inovatrend.petManager.Repository;

import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    Animal findAnimalById(Long id);

    void deleteById(Long id);

}
