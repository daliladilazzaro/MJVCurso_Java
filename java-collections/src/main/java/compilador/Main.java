package compilador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Cadastro> cadastro = new ArrayList();
//        ArrayList <String>cadastro=new ArrayList();

        Cadastro c = new Cadastro("Guitarra", "Warlock", "Tagima", "Preta");
        Cadastro c1 = new Cadastro("Violão", "Simples", "Giannini", "Preta");
        Cadastro c2 = new Cadastro("Baixo", "simples", "michael", "Branca");
        Cadastro c3 = new Cadastro("Bateria", "Completo", "n/a", "Vermelha");
        Cadastro c4 = new Cadastro("Ukulele", "Simples", "Eagle", "Marrom");
        Cadastro c5 = new Cadastro("Guitarra", "Stratocaster", "golden", "Azul");
        Cadastro c6 = new Cadastro("Guitarra", "Warlock", "BcRich", "Branca");
        cadastro.add(c);
        cadastro.add(c1);
        cadastro.add(c2);
        cadastro.add(c3);
        cadastro.add(c4);
        cadastro.add(c5);
        cadastro.add(c6);

        for (Cadastro instrumento : cadastro) {
            System.out.println(instrumento);
        }
        System.out.println("Total de itens: \t\t" + cadastro.size());
        
        //Existe um objeto na lista?
        System.out.println("\n\n*****Busca de item****"+"\n"+cadastro.contains(c4));
        
        //Remove um objeto da lista
        cadastro.remove(c4);
        System.out.println("\n\n*****Excluir item****"+"\n"+cadastro.contains(c4));
        
        //Existe um objeto na lista?
        System.out.println("\n\n*****Busca de item****"+"\n"+cadastro.contains(c4));
              
    }

}
