package operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--);
        // True, por que quando vc usa o ++a na frente da variável o
        // programa identifica que você tem pressa, então a ordem de
        // precedência é primeiro fazer o incremento de a, dps
        // comparar antes de decrementar o b;

        System.out.println(a == b); // aqui é falso a = 2 e b = 1

    }
}
