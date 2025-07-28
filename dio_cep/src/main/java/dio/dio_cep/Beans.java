package dio.dio_cep;

import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }

}
