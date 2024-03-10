import java.util.Scanner;
//????
//S009 Dado um sistema de equações lineares
//e as fórmulas de resolução:
//ax + by = c
//dx + ey = f
//x = ( ce − bf ) / (ae − bd ) e
//y = (af − cd ) / (ae − bd )
//Elabore um programa para ler os coeficientes
//(a, b, c, d, e, f) e apresentar x e y.
public class MathComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número(1º):");
        double a = input.nextDouble();
        System.out.println("Insira um número(2º):");
        double b = input.nextDouble();
        System.out.println("Insira um número(3º):");
        double d = input.nextDouble();
        System.out.println("Insira um número(4º):");
        double e = input.nextDouble();
        System.out.println("Insira um número(5º):");
        double c = input.nextDouble();
        System.out.println("Insira um número(6º):");
        double f = input.nextDouble();
        double x = (c*e) - (b*f) / (a*e) - (b*d);
        double y = (a*f) - (c*d) / (a*e) - (b*d);
        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de y é: " + y);
    }
}
