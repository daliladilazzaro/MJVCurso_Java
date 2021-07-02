package dalila.cadastro;

import dalila.cadastro.model.Aluno;
import dalila.cadastro.model.Cadastro;
import dalila.cadastro.model.ContatoEmergencia;
import dalila.cadastro.model.Endereco;
import dalila.cadastro.model.enums.AlunoNivel;
import dalila.cadastro.repository.AlunoDAO;
import dalila.cadastro.repository.CadastroDAO;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sun.tools.jar.CommandLine;
 
@SpringBootApplication
public class ExemploDeSistemaDeCadastroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploDeSistemaDeCadastroApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(AlunoDAO dao) throws Exception {
        return args -> {
            List <Aluno> alun=dao.findAll();
//            List <Aluno> alun=dao.listAll();
            for (Aluno alunos : alun) {
                System.out.println(alunos.getCadastro().getNome()+"contato "+alunos.getCadastro().getCont1().getNome());
            }
            
            System.out.println("APÓS O SPRING INICIAR");
            Aluno a = new Aluno();
            a.setNivel(AlunoNivel.AV);
            
            Cadastro c=new Cadastro();
            c.setNome("Lila Lazzaro");
            c.setEmail("email@email");
            c.setRg("789456123");
            c.setCpf("32789456123");            
            c.setTelefone(12789456123L);            
            
            Endereco e = new Endereco();
            e.setBairro("Campinas");
            
            c.setEndereco(e);
            
            ContatoEmergencia ce= new ContatoEmergencia();
            ce.setNome("Alfredo");
            ce.setTelefone(14597456212L);
            c.setCont1(ce);
            a.setCadastro(c);
            
            dao.save(a);
        };
    }
}
