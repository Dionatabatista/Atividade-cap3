import java.util.Scanner;

public class Questão7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        scanner.close();

        // Calculando a redução de 20%
        double reducaoPercentual = 0.20;
        double reducaoPeso = peso * reducaoPercentual;

        // Calculando o novo peso
        double novoPeso = peso - reducaoPeso;

        // Exibindo o novo peso
        System.out.println("O novo peso após um emagrecimento de 20% é: " + novoPeso);
    }
}
