package spring_data_jpa.data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring_data_jpa.data_jpa.model.Users;
import spring_data_jpa.data_jpa.model.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Users users = new Users();
        users.setName("heitor");
        users.setUsername("Choran");
        users.setPassword("orangefire123");

        repository.save(users);

        for(Users u: repository.findAll()){
            System.out.println(u);
        }
    }}

