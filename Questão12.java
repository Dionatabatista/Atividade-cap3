import java.util.Scanner;

public class Questão12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        scanner.close();

        // Calculando a quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        // Exibindo a quantidade de salários mínimos
        System.out.print("O funcionário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
