public class Desafio {
    public static void main(String[] args) {
        // part 1
        int operacao1 = 6 * (3 + 2);
        int quadradoOp1  = (int) Math.pow(operacao1, 2);
        int operacao2 = 3 * 2;
        int resultadoOp1e2 = quadradoOp1 / operacao2;
        System.out.println(resultadoOp1e2); // 150
        // part 2

        int operacao3 = (1 - 5) * (2 - 7) / 2;
        int quadradoOp3 = (int) Math.pow(operacao3, 2);
        System.out.println(quadradoOp3); // 100

        // part 3
        int Parcial = resultadoOp1e2 - quadradoOp3;
        int resultadoFinal = (int) ((int) Math.pow(Parcial, 3) / Math.pow(10, 3));
        System.out.println("O resultado da operação é: " + resultadoFinal);

    }
}
