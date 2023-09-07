import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = input.nextDouble();

        // Calculando o desconto de 10%
        double desconto = 0.10;
        double novoPreco = preco - (preco * desconto);

        System.out.println("O novo preço com desconto é: " + novoPreco);

        input.close();
    }
}




