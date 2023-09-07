import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        //Declaração de variaveis

    Scanner entrada = new Scanner(System.in);
    double res, num1, num2;

        //Entrada de dados
    
    System.out.print("Informe o primeiro número ");
    num1 = entrada.nextDouble();
    System.out.print("Informe o segundo número (diferente de zero) ");
    num2 = entrada.nextDouble();

        //Processamento de dados
    
    res = num1/ num2;

        //Saida de dados

    System.out.print("A divisão é: " + res);
    entrada.close();
    
    }
    
}