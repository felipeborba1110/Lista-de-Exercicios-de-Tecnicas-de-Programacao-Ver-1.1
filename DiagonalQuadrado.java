import java.util.Scanner;
import java.lang.Math;

//S012 A Diagonal de uma caixa retangular com dimensões A, B e C é dada por: VA² + B² + C²
//Faça um algoritmo para ler os valores A, B e C e calcular a diagonal da caixa, mostrando
//o resultado na tela.
public class DiagonalQuadrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Largura:");
        double length = Math.pow(input.nextInt(),2);
        System.out.println("Altura:");
        double height = Math.pow(input.nextInt(),2);
        System.out.println("Comprimento:");
        double width = Math.pow(input.nextInt(),2);
        double result = Math.sqrt(length + width + height);
        System.out.printf("A diagonal do seu quadrilatero é: %f", result);
    }
}
