package hr.inovatrend.petManager.Service;

import hr.inovatrend.petManager.Entities.User;

public interface UserService {

    User createUser(User user);

    User getUser(Long id);

   void deleteUser(Long id);

}


