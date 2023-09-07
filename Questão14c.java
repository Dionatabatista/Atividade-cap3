import java.util.Scanner;

public class Questão14c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        scanner.close();

        // Calculando a idade da pessoa em anos
        int idadeAnos = anoAtual - anoNascimento;

        // Calculando a idade em dias (considerando anos bissextos)
        int idadeDias = idadeAnos * 365; // Considera todos os anos não bissextos
        idadeDias += (idadeAnos / 4); // Adiciona dias extras para anos bissextos

        // Exibindo a idade em dias
        System.out.println("A idade da pessoa é: " + idadeDias + " dias");
    }
}
