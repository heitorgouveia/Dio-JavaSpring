package padroes_gof.lab.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import padroes_gof.lab.model.Cliente;
import padroes_gof.lab.model.Endereco;
import padroes_gof.lab.repository.ClienteRepository;
import padroes_gof.lab.repository.EnderecoRepository;
import padroes_gof.lab.service.ClienteService;
import padroes_gof.lab.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
       Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        getEndereco(cliente);
        
        
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            getEndereco(cliente);

        }
    }

     

    @Override
    public void deletar(Long id) {
        
       clienteRepository.deleteById(id);
    }



    private void getEndereco(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
