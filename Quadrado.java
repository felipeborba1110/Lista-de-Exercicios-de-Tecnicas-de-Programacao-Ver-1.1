import java.util.Scanner;

//S006 Faça um algoritmo que leia um valor inteiro
//e apresente no final o resultado do quadrado deste número
public class Quadrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        double total = Math.sqrt(num);
        System.out.printf("O quadrado do seu número é %f", total);
    }
}
