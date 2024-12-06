package operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 300;
        double y = 30.20;
        // Operações divisão de valores double
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        // operação com inteiros, o resultado ficará sempre inteiro
        int a  = 8;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // sem o CAST
        System.out.println(a / (double)b);//CAST para transformar o resultado em double
        System.out.println(a % b); // resto da divisão

    }
}
