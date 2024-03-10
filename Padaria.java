import java.util.Scanner;

//S019 Uma padaria vende certa quantidade de pães franceses e uma quantidade de broas a cada
//dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer
//saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar
//numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os
//cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de
//pães e de broas, e depois calcular os dados solicitados.
public class Padaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos pães foram vendidos hoje:");
        int pao = input.nextInt();
        System.out.println("Quantas boras foram vendidas hoje:");
        int broa = input.nextInt();
        double valorpao = pao * 0.12;
        double valorbroa = broa * 1.50;
        double valortotal = (valorpao + valorbroa);
        double poupar = valortotal*0.1;
        System.out.printf("Foram arrecadados:\nR$%.2f com a venda de pães;\nR$%.2f com a venda de broas;\nTotalizando R$%.2f,\nDeveria-se guardar R$%.2f na poupança.",valorpao,valorbroa,valortotal,poupar);


    }
}
