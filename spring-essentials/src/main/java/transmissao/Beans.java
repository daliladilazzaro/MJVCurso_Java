
package transmissao;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author dilaz
 */
@Configuration
// qual o pacote tem seus compotentes ou uma classe atraves dela scaneia o pacote e os filhos dela ; esse é o ideal
@ComponentScan(basePackageClasses = Main.class) // e pra ele funfar tem que colocar no transmissor  
public class Beans {
    @Bean
    public Gson gson(){
        Gson gson = new Gson();
        return gson;
    }
    //quando precisar, só chamar ele para nao ficar dando new mas nao é o modelo ideal
//    @Bean//sem eles nao funcionam
//    public Transmissor transmissor(){
//        return new Transmissor();
//    }
}
