package spring.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.api.model.Fornecedor;
import spring.api.model.Instrumento;
import spring.api.model.enums.InstrumentoTipo;
import spring.api.repository.FornecedorRepository;
import spring.api.repository.InstrumentoRepository;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
@Bean
    public CommandLineRunner run(FornecedorRepository repository) throws Exception {
        return args -> {
            //Teste com Fornecedor
            Fornecedor fornece = new Fornecedor();
            fornece.setEmpresa("Giannini");
            fornece.setLogradouro("Rua do Giannini");
            fornece.setBairro("Jd Giannini");
            fornece.setNumero("1500 lado B");
            fornece.setEstado("SP");
            fornece.setCidade("São Paulo");
            fornece.setCnpj(14452369000154L);
       
//            repository.save(fornece);
            ObjectMapper mpr = new ObjectMapper();
            String json = mpr.writeValueAsString(fornece);
            System.out.println(json);
            

            //teste com instrumento
//            Instrumento instru = new Instrumento();
//            instru.setTipo(InstrumentoTipo.GUI);
//            instru.setMarca("BcRich");
//            instru.setModelo("Warlock");
//            instru.setCor("Branca");
//       
////            repository.save(instru);
//            ObjectMapper mpr = new ObjectMapper();
//            String json = mpr.writeValueAsString(instru);
//            System.out.println(json);


        };
    }
}

