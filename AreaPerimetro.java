import java.util.Scanner;

//S011 Suponha que a sala de sua casa seja retangular. Faça um algoritmo para ler as dimensões
//da sala e calcular:
//- quantos metros de rodapé são necessários;
//- quantos metros quadrados de piso são necessários;
//- Mostrar na tela os resultados e os dados iniciais lidos.
public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Largura em metros:");
        double width = input.nextDouble();
        System.out.println("Comprimento em metros:");
        double length = input.nextDouble();
        System.out.printf("Para uma sala de %.2f por %.2f metros são necessários:\n", width, length);
        double perimetro = (width + length)*2;
        System.out.println(perimetro + " metros de rodapé!");
        double area = width * length;
        System.out.println("e " + area + " metros quadrados de piso!");
    }
}
