package exercicio_aula01.transmissor;
import java.util.Date;
/**
 *
 * @author dilaz
 */
public class TransmissorSMS extends TransmissorMensagem{

    public TransmissorSMS(Date data) {
        super(data);
    }

    @Override
    public void enviar(String mensagem) {
    }
}
