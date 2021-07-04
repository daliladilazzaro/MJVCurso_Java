package spring.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.api.model.Instrumento;
import spring.api.model.enums.InstrumentoTipo;
import spring.api.repository.InstrumentoRepository;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
@Bean
    public CommandLineRunner run(InstrumentoRepository instrumentoR) throws Exception {
        return args -> {
            Instrumento instru = new Instrumento();
            instru.setTipo(InstrumentoTipo.GUI);
            instru.setMarca("BcRich");
            instru.setModelo("Warlock");
            instru.setCor("Branca");
       
//            instrumentoR.save(instru);
            ObjectMapper mpr = new ObjectMapper();
            String json = mpr.writeValueAsString(instru);
            System.out.println(json);


        };
    }
}

