import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1); // falso
        System.out.println("2".equals(s1)); // true

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // o next tira os espaços em branco, o nextline não.
        System.out.println( "2".equals(s2.trim())); // true
        // use o equals para comparar Strings, nunca ==
        entrada.close();
    }
}
