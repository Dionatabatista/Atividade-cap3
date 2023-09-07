import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida do primeiro ângulo (em graus): ");
        double angulo1 = input.nextDouble();

        System.out.print("Digite a medida do segundo ângulo (em graus): ");
        double angulo2 = input.nextDouble();

        // Calculando a medida do terceiro ângulo
        double angulo3 = 180 - angulo1 - angulo2;

        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");

        input.close();
    }
}
