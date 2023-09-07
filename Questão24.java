import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double dinheiroReais = input.nextDouble();

        // Cotações das moedas
        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;

        // Conversões
        double dinheiroDolares = dinheiroReais / cotacaoDolar;
        double dinheiroMarcoAlemao = dinheiroReais / cotacaoMarcoAlemao;
        double dinheiroLibraEsterlina = dinheiroReais / cotacaoLibraEsterlina;

        System.out.println("Valor em dólares: $" + dinheiroDolares);
        System.out.println("Valor em marco alemão: DM " + dinheiroMarcoAlemao);
        System.out.println("Valor em libra esterlina: £" + dinheiroLibraEsterlina);

        input.close();
    }
}

