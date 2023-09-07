import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salário de João: ");
        double salario = input.nextDouble();

        System.out.print("Digite o valor da primeira conta atrasada: ");
        double conta1 = input.nextDouble();

        System.out.print("Digite o valor da segunda conta atrasada: ");
        double conta2 = input.nextDouble();

        // Calculando a multa de 2% para cada conta
        double multa = 0.02;
        double valorMulta1 = conta1 * multa;
        double valorMulta2 = conta2 * multa;

        // Calculando o valor total a ser pago
        double totalAPagar = salario - (conta1 + valorMulta1 + conta2 + valorMulta2);

        System.out.println("Após pagar as contas, restará: " + totalAPagar);

        input.close();
    }
}
