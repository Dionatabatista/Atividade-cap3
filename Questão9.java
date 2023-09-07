import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        // Declaração de variaveis
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Informe o valor da base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Informe o valor da altura: ");
        double altura = scanner.nextDouble();

        scanner.close();

        // Processamento de dados
        double area = ((baseMaior + baseMenor) * altura) / 2;

        // Saída de dados
        System.out.println("A área do trapézio é: " + area);
    }
}
