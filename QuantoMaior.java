import java.util.Scanner;

//S004 Faça um algoritmo que leia dois valores
//e mostre o ponto percentual de acréscimo ou
//diminuição que ocorreu entre o primeiro e segundo valor.
public class QuantoMaior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o 1º valor");
        float num1 = input.nextFloat();
        System.out.println("Digite o 2º valor");
        float num2 = input.nextFloat();
        float math = num1/num2 * 100;
        if (num1 >= num2){
            System.out.printf("O 1º número é %.0f%% maior que 2º número!", math);
        }
        else{
            System.out.printf("O 2º número é %.0f%% menor que 2º número!", math);
        }
    }
}
