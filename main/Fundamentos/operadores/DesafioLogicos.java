package operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;
        boolean sorvete = trabalhoTerca || trabalhoQuinta;

        System.out.println(trabalhoTerca && trabalhoQuinta && sorvete);
        System.out.println(!trabalhoTerca && trabalhoQuinta);

    }
}
