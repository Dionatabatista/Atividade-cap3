import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cateto A: ");
        double catetoA = scanner.nextDouble();

        System.out.print("Digite o valor do cateto B: ");
        double catetoB = scanner.nextDouble();

        scanner.close();

        // Calculando a hipotenusa usando o teorema de Pitágoras
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        // Exibindo o valor da hipotenusa
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}
