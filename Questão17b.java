import java.util.Scanner;

public class Questão17b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();

        // Valor de π (pi)
        double pi = Math.PI;

        // Calculando o comprimento da esfera
        double comprimento = 2 * pi * raio;

        System.out.println("O comprimento da esfera é: " + comprimento);

        input.close();
    }
}

