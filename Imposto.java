import java.util.Scanner;

//S003 Faça um algoritmo que leia o valor unitário
//de um produto, a quantidade e o percentual de
//imposto. Calcule e mostre o valor total do produto
//acrescentando o imposto lido
public class Imposto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor unitário:");
        double valor = input.nextDouble();
        System.out.println("Insira a quantidade:");
        double quant = input.nextDouble();
        System.out.println("Insira a porcentagem de imposto:");
        double imposto = (input.nextDouble() + 100)/100;
        double total = (valor * quant)*imposto;
        System.out.printf("O valor total da compra é R$%.2f!", total);
    }
}
