import java.util.Scanner;

public class Questão19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento do cômodo (em metros): ");
        double comprimento = input.nextDouble();

        System.out.print("Digite a largura do cômodo (em metros): ");
        double largura = input.nextDouble();

        // Calculando a área do cômodo em metros quadrados
        double area = comprimento * largura;

        // Calculando a potência de iluminação em watts
        double potenciaIluminacao = area * 18;

        System.out.println("A área do cômodo é: " + area + " m²");
        System.out.println("A potência de iluminação necessária é: " + potenciaIluminacao + " W");

        input.close();
    }
}
