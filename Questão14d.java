import java.util.Scanner;

public class Questão14d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        scanner.close();

        // Calculando a idade da pessoa em anos
        int idadeAnos = anoAtual - anoNascimento;

        // Calculando a idade em semanas
        int idadeSemanas = idadeAnos * 52; // Aproximação de 52 semanas por ano

        // Exibindo a idade em semanas
        System.out.println("A idade da pessoa é: " + idadeSemanas + " semanas");
    }
}
