package hr.inovatrend.petManager.Service;

import hr.inovatrend.petManager.Entities.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAll();

   void deleteUserById(Long id);

}


