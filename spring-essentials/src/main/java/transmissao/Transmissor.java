package transmissao;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dilaz
 */
@Component
public class Transmissor {
// transmissor que uam dependenca de contatoDAO qeu nao tem new mas sabe quqe o spring ja criou no meu contexto 
    //ele vai ficar consumindo outros recursos, pode ter dao model, etc

    @Autowired
    private ContatoDAO dao;

    @Autowired
    private Gson gson;
    public void enviar(Integer ID, String mensagem) {
        /*Contato contato*/
        Contato contato = dao.find(ID);
//        Gson gson=new Gson();
        String json = gson.toJson(contato);
        System.out.println(json);
        System.out.println("Enviar mensagem para o numero: " + contato.getTelefone());
        System.out.println(String.format("Olá %s!\n%s.", contato.getNome(), mensagem));
    }
}
