package hr.inovatrend.petManager.Repository;

import hr.inovatrend.petManager.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    void deleteById(Long id);

}
