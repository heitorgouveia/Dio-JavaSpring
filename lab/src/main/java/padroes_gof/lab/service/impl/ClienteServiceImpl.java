package padroes_gof.lab.service.impl;

import org.springframework.stereotype.Service;

import padroes_gof.lab.model.Cliente;
import padroes_gof.lab.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Override
    public Iterable<Cliente> buscarTodos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Cliente buscarPorId(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public void inserir(Cliente cliente) {
        
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

}
