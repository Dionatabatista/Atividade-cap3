import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        scanner.close();

        // Processamento de dados
        double area = lado * lado;

        // Saída de dados
        System.out.println("A área do quadrado é: " + area);
    }
}
