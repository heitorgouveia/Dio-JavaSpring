package projeto_rest_web.projeto.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import projeto_rest_web.projeto.handler.BusinessException;
import projeto_rest_web.projeto.model.Usuario;

@Repository
public class UsarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new BusinessException("O campo login é obrigatório");
        if(usuario.getId()==null)
        System.out.println("Save - recebendo o usuário na camda de repository");
        else
        System.out.println("Update - Recebendo usuário na camada de repository");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuario"   , id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Heitor","orange"));
        usuarios.add(new Usuario("Tiago", "Black"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("Find/id - Recebendo o id: %d para Localizar um usuario" , id));
        return new Usuario("Heitor", "orange");

    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário  ", username));
        return new Usuario("Heitor", "black");
    }
}
