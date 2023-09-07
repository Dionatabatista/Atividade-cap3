import java.util.Scanner;

public class Questão7a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        scanner.close();

        // Calculando o aumento de 15%
        double aumento = 0.15; // 15% em forma decimal
        double novoPeso = peso * (1 + aumento);

        // Exibindo o novo peso
        System.out.println("O novo peso após o aumento de 15% é: " + novoPeso);
    }
}
