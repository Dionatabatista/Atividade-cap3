import java.util.Scanner;

public class Questão14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        scanner.close();

        // Calculando a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // Exibindo a idade
        System.out.println("A idade da pessoa é: " + idade + " anos");
    }
}
