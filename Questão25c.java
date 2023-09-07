import java.util.Scanner;

public class Questão25c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = input.nextInt();

        // Convertendo minutos em segundos
        int segundos = minutos * 60;

        System.out.println("O total de minutos em segundos é: " + segundos + " segundos.");

        input.close();
    }
}

