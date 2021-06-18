package transmissor;
import java.util.Date;
/**
 *
 * @author dilaz
 */
public class TransmissorEmail extends TransmissorMensagem {
   private String titulo;
	
	public TransmissorEmail(Date data) {
		super(data);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void enviar(String mensagem) {
	}
	 
}
