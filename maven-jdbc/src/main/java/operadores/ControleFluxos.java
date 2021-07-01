package operadores;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class ControleFluxos {

    public static void main(String[] args) {
//        int num=4;
//        System.out.println(fatorial(num));
          arrays();
    }
    static void arrays(){
        String [] nulo= null;
        String [] vazio={};
        System.out.println(vazio.length);
        String [] nome=new String[5];
        nome[0]="A";
        nome[1]="b";
        nome[2]="c";
        nome[3]="d";
        nome[4]="e";
        nome[4]="z";
        for (String nomes : nome) {
            System.out.println(nomes);
        }
        String nome2[]={"a","b","c","d","e"};
    }
    
    static void recebeVarArgs(String ... var){//forma abistrata para receber um array, permite maior flexiblidae´é dinamico
        
    }
    static void recebeArray(String [] var){
        
    }

    static void recursividade(int num) {
        fatorial(5);
    }

    static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }

    static void exemploDoWhile() {
        boolean var = true;
        int x = 1;
        do {
            System.out.println(x++);
            var = x < 5;
        } while (x <= 5);
    }

    static void exemploWhile() {
        boolean var = true;
        int x = 1;
        while (var) {
            System.out.println(x++);
            var = x < 5;
        }
    }

    static void exemploFor() {
        int i = 0;
        for (start(); i < 10; replay()) {
            System.out.println(++i);
        }
    }

    static void start() {
        System.out.println("start");
    }

    static void replay() {
        System.out.println("replay");
    }

    static void forEach() {
        String nome[] = {"Lila", "Odete", "Santos"};
        for (String nomes : nome) {
            System.out.println(nomes);
        }
        List<String>ls=Arrays.asList(nome);
        ls.stream().forEach(n->System.out.println(n));//java lambda funcional
    }
}
