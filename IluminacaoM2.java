import java.util.Scanner;

//S016 Sabe-se que para iluminar de maneira correta
//os cômodos de uma casa para cada m2 devese usar 18 W de
//potência. Faça um algoritmo para ler as duas dimensões
//de um cômodo (em metros), calcule e imprima a sua área (em m2)
//e a potência de iluminação que deverá ser utilizada.
public class IluminacaoM2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Largura:");
        float width = input.nextFloat();
        System.out.println("Comprimento:");
        float lenght = input.nextFloat();
        float m2 = width * lenght;
        float luz = m2*18;
        System.out.printf("Para sua residência de %.2fm², seria recomendado %.0fW de potência!",m2,luz);
    }
}
