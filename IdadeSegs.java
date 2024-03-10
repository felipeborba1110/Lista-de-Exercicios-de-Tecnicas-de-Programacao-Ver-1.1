import java.util.Scanner;

//S008 Escreva um programa que leia a idade de uma
//pessoa e mostre na tela quantos segundos
//esta pessoa já viveu sem considerar ano bissexto
public class IdadeSegs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        double idade = input.nextDouble();
        double segs = (((idade*365)*24)*60)*60;
        System.out.printf("Sua idade em segundos é %fs", segs);
    }
}
