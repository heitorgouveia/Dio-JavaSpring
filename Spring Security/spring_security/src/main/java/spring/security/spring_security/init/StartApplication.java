package spring.security.spring_security.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.security.spring_security.model.User;
import spring.security.spring_security.repository.UsersRepository;

import java.util.List;

@Component
public class StartApplication implements CommandLineRunner{
    @Autowired
    private UsersRepository repository;
    @Override
    public void run(String... args) throws Exception {
       List<User> users = repository.findByUsername("admin");
       User user = users.isEmpty() ? null : users.get(0);
       if (user == null) {
           user = new User();
           user.setName("Admin");
           user.setUsername("admin");
           user.setPassword("master123");
           user.getRoles().add("MANAGERS");
           repository.save(user);
       }
       users = repository.findByUsername("user");
       if (user == null) {
            user = new User();
            user.setName("User");
            user.setUsername("user");
            user.setPassword("user123");
            user.getRoles().add("USERS");
            repository.save(user);
       }
       
    }
}