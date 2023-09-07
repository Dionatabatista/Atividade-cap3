import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilos: ");
        double pesoQuilos = scanner.nextDouble();

        scanner.close();

        // Convertendo o peso para gramas (1 quilo = 1000 gramas)
        double pesoGramas = pesoQuilos * 1000;

        // Exibindo o peso em gramas
        System.out.println("O peso em gramas é: " + pesoGramas + " gramas");
    }
}


