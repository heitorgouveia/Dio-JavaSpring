package padroes_gof.lab.service;

import org.springframework.stereotype.Service;

import padroes_gof.lab.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente. Com 
 * isso, se necessário, podemos ter múltiplas implementações dessa mesma interface.
 */


public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar( Long id, Cliente cliente);
    void deletar (Long id);


}
