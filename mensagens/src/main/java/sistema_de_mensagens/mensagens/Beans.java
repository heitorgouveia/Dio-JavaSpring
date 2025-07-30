package sistema_de_mensagens.mensagens;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sistema_de_mensagens.Remetente;


@Configuration
public class Beans {

     @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }

}
