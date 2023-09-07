import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {

    //Declaração de variaveis
     Scanner entrada = new Scanner(System.in);
    double nota1, nota2, mediaPon;

    //Entrada de dados
    System.out.print("Informe a primeria nota: ");
    nota1 = entrada.nextDouble();
    System.out.print("Informe a segunda nota: ");
    nota2 = entrada.nextDouble();

    //Processamento de dados
    mediaPon = nota1 * 2 + nota2 * 3 /2+3;

    //Saida de dados
    System.out.print("A media ponderada é: " + mediaPon);
    entrada.close();
    }
    
}