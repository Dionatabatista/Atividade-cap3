import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        //Declaração de variaveis

        Scanner entrada = new Scanner(System.in);
        double res, num1, num2, num3;

        //Entrada de dados

        System.out.print("Informe um número ");
        num1 = entrada.nextDouble();
        System.out.print("Informe outro número ");
        num2 = entrada.nextDouble();
        System.out.print("Informe outro número ");
        num3 = entrada.nextDouble();

        //processamento de dados

        res = num1 * num2 * num3;

        //Saida de dados

        System.out.print("A mutiplicação é: " + res);
        entrada.close();
    }
    
}