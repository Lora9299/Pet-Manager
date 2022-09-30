package hr.inovatrend.petManager.Service.Impl;

import hr.inovatrend.petManager.Entities.User;
import hr.inovatrend.petManager.Repository.UserRepository;
import hr.inovatrend.petManager.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findUserById(id);
    }

    public void deleteUser(Long id){

        userRepository.deleteById(id);

    }

}
