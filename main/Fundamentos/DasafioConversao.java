import java.util.Scanner;

public class DasafioConversao {
//    public static void main(String[] args) {
//        String salario1 = JOptionPane.showInputDialog("Digite seu salário do primeiro mês");
//        String salario2 = JOptionPane.showInputDialog("Digite seu salário do segundo mês");
//        String salario3 = JOptionPane.showInputDialog("Digite seu salário do terceiro mês");
//
//        System.out.println(salario1 + salario2 + salario3);
//
//        double numero1 = Double.parseDouble(salario1);
//        double numero2 = Double.parseDouble(salario2);
//        double numero3 = Double.parseDouble(salario3);
//
//        double media =  (numero1 + numero2 + numero3) / 3;
//        System.out.println("A média do salário é de: " + media);
//    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // instância do scanner

        System.out.println("Digite seu salário do mês de agosto: ");
        String salario1 = teclado.nextLine().replace(",", ".");
        System.out.println("Digite seu salário do mês de agosto: ");
        String salario2 = teclado.nextLine().replace(",", ".");
        System.out.println("Digite seu salário do mês de agosto: ");
        String salario3 = teclado.nextLine().replace(",", ".");
        teclado.close(); // fim do scanner

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média do salário de João é de: " + media);
    }
}
