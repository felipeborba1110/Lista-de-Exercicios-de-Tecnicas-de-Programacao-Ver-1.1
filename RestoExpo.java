import java.util.Scanner;

//S002 Desenvolver um programa que leia dos valores
//e mostre o resto da divisão do primeiro
//valor digitado pelo segundo e também a exponenciação
//do segundo pelo primeiro valor lido.
public class RestoExpo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        double num1 = input.nextDouble();
        System.out.println("Digite o 2º número:");
        double num2 = input.nextDouble();
        double resto = num1 % num2;
        System.out.println("O resto da divisão do primeiro pelo segundo é: " + resto);
        double pow = Math.pow(num2, num1);
        System.out.print("O segundo número elevado ao primeiro é: " + pow);
    }
}
