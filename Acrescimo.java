import java.util.Scanner;

//S001 Criar um algoritmo que leia o valor de um produto e imprima na console este valor com
//30% de acréscimo.
public class Acrescimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double valor = input.nextDouble() * 1.3;
        System.out.printf("O seu valor com 30%% de acréscimo é %.2f!", valor);
    }
}
