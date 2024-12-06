package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = b + a;
        c+= b; // c = c + b;
        c-= a; // c = c - b;
        c*= b; // c = c * b;
        c/= a; // c = c / a;

        System.out.println(c);

        c%= 2; // c = c % 2; ou 1
        System.out.println(c);
    }
}
