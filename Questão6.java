import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        double valorVendas = scanner.nextDouble();

        scanner.close();

        // Calculando a comissão (4% das vendas)
        double comissao = 0.04 * valorVendas;

        // Calculando o salário final (salário fixo + comissão)
        double salarioFinal = salarioFixo + comissao;

        // Exibindo a comissão e o salário final
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final: " + salarioFinal);
    
    }
}
