import java.util.Scanner;

public class Questão22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono convexo: ");
        int numeroLados = input.nextInt();

        // Calculando o número de diagonais
        int numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;

        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);

        input.close();
    }
}

