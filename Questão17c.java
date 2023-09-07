import java.util.Scanner;

public class Questão17c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();

        // Valor de π (pi)
        double pi = Math.PI;

        // Calculando o volume da esfera
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.println("O volume da esfera é: " + volume);

        input.close();
    }
}
