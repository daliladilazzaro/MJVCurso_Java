package operadores;

/**
 *
 * @author dilaz
 */
public class Operadores {

    public static void main(String[] args) {
        forBreak();
    }

    static void forBreak(){
        for (int i = 1; i <= 10; i++) {
            if (i==5 || i==8) {
                break;
            }
            System.out.println(i);
        }
    }
    static void forContinue(){
        for (int i = 1; i <= 10; i++) {
            if (i==5 || i==8) {
                continue;
            }
            System.out.println(i);
        }
    }
    static void logicosHard() {
        int n1 = 1;
        int n2 = 2;

        if (n1 == n2 & ++n1 == n2) {
            System.out.println("bingo");
        }
        System.err.println(n1 + " -- " + n2);
        n1 = 1;
        n2 = 2;
        if (n1 == n2 && ++n1 == n2) {
            System.out.println("bingo");
        }
        System.err.println(n1 + " -- " + n2);
        n1 = 1;
        n2 = 2;
        if (n1 == n2 | ++n1 >= n2) {
            System.out.println("bingo");
        }
        System.err.println(n1 + " -- " + n2);
        n1 = 1;
        n2 = 2;
        if (n1 == n2 || ++n1 >= n2) {
            System.out.println("bingo");
        }
        System.err.println(n1 + " -- " + n2);
    }

    static void logicos() {
        boolean val = true;
        boolean val2 = false;
        if (val && val2) {
            System.out.println("precisam ser true");
        }
        if (val || val2) {
            System.out.println("um dos dois tem que ser true");
        }
    }

    static void ternario(int nota) {
        boolean aprv = nota >= 7;
        String res = aprv ? "aprovado" : "reprovado";

//        if (aprv) {
//            res = "Aprovado";
//        } else {
//            res = "Reprovado";
//        }
        System.out.println(res);
//        
//        boolean vdd = true;
//        if (!vdd) {
//            
//        }

    }

    static void relacionais() {
        int a = 1;
        int b = 1;
        if (b == a) {

        }
        if (b != a) {

        }
    }

    static void unario() {
        int n = 1;
        System.out.println(-n);
//        n++;
        System.out.println(++n);
    }

    static void atribuicao() {

        Integer n1 = 1;
        String n2 = "1";
        Integer n3 = 1;
        System.out.println(n1 + n2 + n3);
        System.out.println(n1 + n3 + n2);
        System.out.println(n2 + (n3 + n1));
    }
}
