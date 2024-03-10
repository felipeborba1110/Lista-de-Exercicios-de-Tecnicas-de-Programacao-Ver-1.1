import java.util.Scanner;

//S015 Cada degrau de uma escada tem X de altura.
//Elabore um algoritmo que receba essa altura
//e a altura que o usuário deseja alcançar subindo
//a escada. Calcule e mostre quantos
//degraus o usuário deverá subir para atingir seu objetivo,
//sem se preocupar com a altura do usuário
public class Escada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Altura do degaru:");
        float degrau = input.nextFloat();
        System.out.println("Altura do destino:");
        float destino = input.nextFloat();
        float total = destino / degrau;
        System.out.println("Para alcançar seu destino, subirá " + total + " degarus!");
    }
}
