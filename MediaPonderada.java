import java.util.Scanner;

//S028 Fazer um algoritmo para ler duas notas, os pesos de cada nota e mostrar a média
//ponderada.
//Calculo da Média Ponderada = ((nota 1 * peso da nota 1) + (nota 2 * peso da nota 2) ) /
//soma dos pesos
public class MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a 1ª nota:");
        float nota1 = input.nextFloat();
        System.out.println("Insira a 2ª nota:");
        float nota2 = input.nextFloat();
        System.out.println("Insira o peso da 1ª nota:");
        float peso1 = input.nextFloat();
        System.out.println("Insira o peso da 2ª nota:");
        float peso2 = input.nextFloat();
        float mediap = ((nota1 * peso1) + (nota2 * peso2)) / peso1 + peso2;
        System.out.println("A media ponderada é " + mediap);
    }
}
