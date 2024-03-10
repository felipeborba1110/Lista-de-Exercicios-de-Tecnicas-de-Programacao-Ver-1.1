import java.util.Scanner;

//S013 Faça um algoritmo que receba o valor de
//um depósito e o valor da taxa de juros (em %).
//Calcule e imprima o valor do rendimento e o
//valor total depois do rendimento.
public class Rendimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do depósito:");
        double deposito = input.nextDouble();
        System.out.println("Por quantos messes pretende deixar rendendo:");
        double tempo = input.nextDouble();
        System.out.println("Taxa de juros:");
        double juros = (input.nextDouble()+100)/100;
        double jurossimples = deposito * juros;
        double rendeu = tempo*(jurossimples-deposito);
        double total = rendeu + deposito;
        System.out.printf("Seu depósito com juros simples rendeu +R$%.2f. Totalizando R$%.2f na conta!\n",rendeu,total);
        double juroscomposto = deposito;
        while (tempo > 0){
            juroscomposto *= juros;
            --tempo;
            if (tempo == 0) {
                double rendeucomposto = juroscomposto - deposito;
                System.out.printf("Seu depósito com juros composto rendeu +R$%.2f. Totalizando R$%.2f na conta!",rendeucomposto,juroscomposto);
            }
        }
    }
}
