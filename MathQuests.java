import java.util.Scanner;

//S005 Faça um algoritmo que leia um número inteiro qualquer e ao final mostre na tela:
//1) O dobro do número que foi digitado
//2) A sua terça parte
//3) O seu antecessor
//4) O seu sucessor
public class MathQuests {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        float num = input.nextFloat();
        float dobro = num * 2;
        System.out.printf("O dobro do seu número é: %.2f\n",dobro);
        float terco = num / 3;
        System.out.printf("A terça parte do seu número é: %.2f\n",terco);
        float prev = num - 1;
        System.out.printf("O antecessor do seu número é: %.2f\n",prev);
        float next = num + 1;
        System.out.printf("O sucessor do seu número é: %.2f",next);
    }
}
