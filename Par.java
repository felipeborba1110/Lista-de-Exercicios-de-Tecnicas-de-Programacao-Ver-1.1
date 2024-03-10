import java.util.Scanner;

public class Par {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Número:");
            num = input.nextInt();
            if (num % 2 == 0) {
                System.out.printf("O número %d é par\n", num);
            } else {
                System.out.printf("O número " + num + " é impar\n");
            }
        }
    }
}
