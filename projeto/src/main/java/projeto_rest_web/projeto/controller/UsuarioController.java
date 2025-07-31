package projeto_rest_web.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import projeto_rest_web.projeto.model.Usuario;
import projeto_rest_web.projeto.repository.UsarioRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class UsuarioController {
    @Autowired
    private UsarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username")String username){
        return repository.findByUsername(username);

    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id")Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);

    }

}
