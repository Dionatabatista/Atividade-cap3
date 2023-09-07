import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
    //Declaração de variaveis
        Scanner scanner = new Scanner(System.in);
        double diagonalMaior, diagonalMenor, area;

    //entrada de dados
        System.out.print("Informe a diagonal maior: ");
        diagonalMaior = scanner.nextDouble();
        System.out.print("Informe a diagonal menor: ");
        diagonalMenor = scanner.nextDouble();

    //Processamento de dados
        area = diagonalMaior * diagonalMenor /2;

    //Saída de dados
        System.out.print("A área é: "+area);

        scanner.close();
    }
}


        