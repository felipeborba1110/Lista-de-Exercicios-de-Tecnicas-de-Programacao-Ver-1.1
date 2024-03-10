import java.util.Scanner;

//S010 Faça um algoritmo que leia uma temperatura
//dada na escala Celsius (C),depois calcule e mostre temperatura
//equivalente em Fahrenheit (F): F = C*(9/5) + 32
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a temperatura em Cº:");
        float c = input.nextFloat();
        float f = c*((float)9/5) + 32;
        System.out.printf("A temperatura em Fº é: %.1f!",f);
    }
}
