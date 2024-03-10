import java.util.Scanner;

//S014 Sabe-se que: 1 pé = 12 polegadas,
//1 jarda = 3 pés e
//1 milha = 1760 jardas.
//Elabore um algoritmo que receba uma medida em pés,
//faça as conversões para: polegadas,
//jardas e milhas e mostre os resultados.
public class SistemaMetrico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pés:");
        int pes = input.nextInt();
        double polegada = pes * 12;
        double jarda = (double) pes / 3;
        double milha = jarda / 1760;
        System.out.printf("%d pés são convertidos para:\n%.3f polegadas \nou %.3f jardas, que são %f milhas!", pes, polegada, jarda, milha);
    }
}
