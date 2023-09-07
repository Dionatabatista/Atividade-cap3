import java.util.Scanner;

public class Questão14b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        scanner.close();

        // Calculando a idade da pessoa em anos e meses
        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;

        // Exibindo a idade em meses
        System.out.println("A idade da pessoa é: " + idadeMeses + " meses");
    }
}
