import java.util.Scanner;

//S029 Escreva um algoritmo para criar um programa de ajuda para vendedores. A partir de um
//valor total recebido do teclado, mostrar:
//- o total a pagar com desconto de 10%;
//- o valor de cada parcela, no parcelamento de 3 x sem juros;
//- a comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto )
//- a comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
public class Vendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do produto:");
        float valor = input.nextFloat();
        double desconto = valor * 0.9;
        System.out.println("Valor com desconto: R$" + desconto);
        float parcela = valor/3;
        System.out.println("Valor de cada parcela (3x s/ juros): R$" + parcela);
        double avista = desconto * 0.05;
        System.out.println("Comissão do vendedor a vista: R$" + avista);
        double parcelado = valor * 0.05;
        System.out.println("Comissão do vendedor parcelado: R$" + parcelado);
    }
}
