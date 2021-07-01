/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmissao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author dilaz
 */
@Repository // tudo é componente mas é uma questao declarativa do papel dessa classe como ocomponente no spring, só normativa
public class ContatoDAO {
    public Contato find(Integer id){
        Contato c = new Contato();
        c.setNome("Lila");
        c.setTelefone(11947563214L);
        return c;
    }
}
