package transmissao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dilaz
 */
public class Main {

    public static void main(String[] args) {
//        Contato c = new Contato();
//        c.setNome("Lila");
//        c.setTelefone(11947563214L);

        //ele dará new
//        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext contexto = byAnnotation();
//        Transmissor t = new Transmissor();
        Transmissor t = contexto.getBean(Transmissor.class);
        t.enviar(1, "Sua encomenda está a caminho!!! :) ");
    }

    static ApplicationContext byXml() {
        return new ClassPathXmlApplicationContext("beans.xml");
    }

    static ApplicationContext byAnnotation() {
        return new AnnotationConfigApplicationContext(Beans.class);//chamando Bans para nao dar new
    }

}
