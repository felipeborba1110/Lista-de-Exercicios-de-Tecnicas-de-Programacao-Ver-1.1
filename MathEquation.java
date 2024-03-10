import java.util.Scanner;

//S027 Faça um algoritmo leia as variáveis x, y e z. Mostre o resultado da expressão: (( x – 5) *
//y) – z
public class MathEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de X:");
        float x = input.nextFloat();
        System.out.println("Valor de Y:");
        float y = input.nextFloat();
        System.out.println("Valor de Z:");
        float z = input.nextFloat();
        float calc = (( x - 5) * y) - z;
        System.out.println("O resultado é " + calc);
    }
}
