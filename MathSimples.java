import java.util.Scanner;

public class MathSimples {
//S026 Faça um algoritmo que leia valores para as variáveis A, B e C e mostre o resultado da
//seguinte expressão: (A–B)*C
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o 1º valor:");
        int A = input.nextInt();
        System.out.print("Insira o 2º valor:");
        int B = input.nextInt();
        System.out.print("Insira o 3º valor:");
        int C = input.nextInt();
        int calc = (A-B)*C;
        System.out.println("O resultado do seu 1º valor menos o 2º vezes o 3º:");
        System.out.print(calc);
    }
}
