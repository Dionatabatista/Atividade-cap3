import java.util.Scanner;

public class Questão13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.print("Tabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

