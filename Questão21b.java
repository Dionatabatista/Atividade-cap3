import java.util.Scanner;

public class Questão21b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = input.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        double horasExtras = input.nextDouble();

        // Valor da hora normal (1/8 do salário mínimo)
        double valorHoraNormal = salarioMinimo / 8;

        // Valor da hora extra (1/4 do salário mínimo)
        double valorHoraExtra = salarioMinimo / 4;

        // Calculando o salário a receber
        double salario = (horasTrabalhadas * valorHoraNormal) + (horasExtras * valorHoraExtra);

        System.out.println("O salário a receber é: R$" + salario);

        input.close();
    }
}

