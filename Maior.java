import java.util.Scanner;

//S024 Fazer um algoritmo para ler dois números e mostrar o maior deles
public class Maior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um num:");
        int num = input.nextInt();
        System.out.println("Insira outro num:");
        int num2 = input.nextInt();
        if (num > num2) {
            System.out.printf("O %d é maior que o %d", num, num2);
        }
        else {
            System.out.printf("O %d é maior que o %d", num2, num);
        }
    }
}
