import java.util.Scanner;

//S017 Elabore um algoritmo que leia a quantidade de dinheiro em reais que uma pessoa que vai
//viajar possui. Essa pessoa vai passar por vários países e precisa converter seu dinheiro em
//Dólares, Euro e Libra Esterlina. Leia a cotação do dólar, do Euro e da Libra Esterlina, e
//faça as conversões do que a pessoa possui para cada uma destas moedas. O algoritmo
//deverá fazer e mostrar os valores das conversões.
public class CambioDinheiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos Reais você possui:");
        float real = input.nextFloat();
        System.out.println("Qual a cotação do Dolar:");
        float dolar = input.nextFloat();
        System.out.println("Qual a cotação do Euro:");
        float euro = input.nextFloat();
        System.out.println("Qual a cotação da Libra Esterlina:");
        float libra = input.nextFloat();
        float dolartotal = real / dolar;//4,9808
        float eurototal = real / euro;//5,4457
        float libratotal = real / libra;//6,40481
        System.out.printf("O seu dinheiro R$%.2f pode ser convertido para:\n$%.2f Dólares;\n€%.2f Euros,\n£%.2f Libras Esterlinas.",real,dolartotal,eurototal,libratotal);
    }
}
