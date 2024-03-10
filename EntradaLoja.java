import java.util.Scanner;

//S021 Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a entrada
//maior do que ou igual às duas prestações, as quais devem ser iguais, inteiras e as maiores
//possíveis.
//Por exemplo, se o valor da mercadoria for R$ 270,00, a entrada e as duas prestações são
//iguais a R$ 90,00; se o valor da mercadoria for R$ 302,75, a entrada é de R$ 102,75 e as
//duas prestações são a iguais a R$ 100,00.
//Escreva um programa que receba o valor da mercadoria e forneça o valor da entrada e das
//duas prestações, de acordo com as regras acima.
public class EntradaLoja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor do produto:");
        float produto = input.nextFloat();
        double calc = produto/3;
        int round = (int) Math.round(calc);
        if (!(calc == round)){
            double diff = ((calc-round)*2)+calc;
            System.out.printf("O valor de entrada é R$%.2f e o valor das 2 prestações são R$%d,00", diff, round);
        }
        else {
            System.out.printf("O valor de entrada é R$%.2f e o valor das 2 prestações são R$%d,00", calc, round);
        }
    }
}
