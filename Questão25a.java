import java.util.Scanner;

public class Questão25a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora (0-23): ");
        int hora = input.nextInt();

        System.out.print("Digite os minutos (0-59): ");
        int minutos = input.nextInt();

        // Convertendo a hora para minutos
        int totalMinutos = (hora * 60) + minutos;

        System.out.println("A hora digitada equivale a " + totalMinutos + " minutos.");

        input.close();
    }
}
