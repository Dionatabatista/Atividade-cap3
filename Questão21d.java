import java.util.Scanner;

public class Questão21d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = input.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        double horasExtras = input.nextDouble();

        System.out.print("Digite o valor da hora extra: ");
        double valorHoraExtra = input.nextDouble();

        // Calculando o salário a receber
        double valorHoraNormal = salarioMinimo / 8; // 1/8 do salário mínimo por hora normal
        double salario = (horasTrabalhadas * valorHoraNormal) + (horasExtras * valorHoraExtra);

        System.out.println("O salário a receber é: R$" + salario);

        input.close();
    }
}

