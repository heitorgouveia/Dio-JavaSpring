package projeto_rest_web.projeto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WelcomeController {
    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String welcome(){
        return "Welcome to my Spring Boot web API";
    }

}
