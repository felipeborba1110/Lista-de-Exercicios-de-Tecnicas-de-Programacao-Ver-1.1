import java.util.Scanner;

//S025 Faça um algoritmo que leia o nome e as idades de duas pessoas e mostre a soma das
//idades
public class SomaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome da 1º pessoa:");
        String name1 = input.next();
        System.out.println("Idade da 1º pessoa:");
        int age1 = input.nextInt();
        System.out.println("Nome da 2º pessoa:");
        String name2 = input.next();
        System.out.println("Idade da 2º pessoa:");
        int age2 = input.nextInt();
        int sum = age1 + age2;
        System.out.println("A soma das idades de " + name1 + " e de " + name2 + " é:");
        System.out.print(sum);
    }
}
