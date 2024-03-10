import java.util.Scanner;

//S023 Escreva um algoritmo que leia um número e mostre seu inteiro
public class FloatToInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número:\n");
        double num = input.nextDouble();
        System.out.printf("O numero inteiro mais próximo do seu é %.0f", num);
        //double num = Math.sqrt(input.nextInt());
        //System.out.printf("Raiz completa do número é %f\n", num);
        //System.out.printf("Raiz inteira aproximada do número é %.0f", num);
    }
}
