package hr.inovatrend.petManager.Service.Impl;

import hr.inovatrend.petManager.Entities.User;
import hr.inovatrend.petManager.Repository.UserRepository;
import hr.inovatrend.petManager.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.findUserById(id);
    }

    public void deleteUserById(Long id){

        userRepository.deleteById(id);

    }

    public List<User> getAll(){

        return userRepository.findAll();

    }

}
