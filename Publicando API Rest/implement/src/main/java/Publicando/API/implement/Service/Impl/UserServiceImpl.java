package Publicando.API.implement.Service.Impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import Publicando.API.implement.Repository.UserRepository;
import Publicando.API.implement.Service.UserService;
import Publicando.API.implement.model.User;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number Already exists.");
        }
        return userRepository.save(userToCreate);
    }

}
