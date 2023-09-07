import java.util.Scanner;
import java.lang.Math;

public class Questão20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida do ângulo (em graus): ");
        double anguloGraus = input.nextDouble();

        System.out.print("Digite a distância da escada à parede (em metros): ");
        double distanciaParede = input.nextDouble();

        // Convertendo o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calculando o comprimento da escada usando a função seno
        double comprimentoEscada = distanciaParede / Math.sin(anguloRadianos);

        System.out.println("O comprimento da escada necessário é: " + comprimentoEscada + " metros");

        input.close();
    }
}

