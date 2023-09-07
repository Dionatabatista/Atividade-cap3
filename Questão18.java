import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();

        // Calculando a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        input.close();
    }
}
