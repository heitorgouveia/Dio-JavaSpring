package projeto_rest_web.projeto.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

   @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Minha API")
                .description("Descrição da API")
                .version("1.0")
                .contact(new Contact()
                    .name("Heitor")
                    .email("heitor@example.com")
                    .url("http//seusite.com.br")
                    
                )
            )
            .addServersItem(new Server().url("http://localhost:8080"));
    }
}
