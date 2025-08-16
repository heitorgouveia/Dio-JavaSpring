package spring.jwt.json_web_token.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import spring.jwt.json_web_token.model.User;
import spring.jwt.json_web_token.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;
    public void createUser(User user){
        String pass = user.getPassword(); //Criptografando antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }


}
