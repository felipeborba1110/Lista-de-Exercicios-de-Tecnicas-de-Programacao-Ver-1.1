import java.util.Scanner;

//S020 Uma lanchonete vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
//queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de
//queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça
//um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina
//informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.
public class Lanchonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos sanduíches:");
        float sanduiche = input.nextFloat();
        float queijo = (sanduiche * 100)/1000;
        float presunto = (sanduiche * 50)/1000;
        float hamburguer = (sanduiche * 100)/1000;
        System.out.printf("Para fazer %.0f sanduíches são necessários:\n%.1fKg de queijo;\n%.1fKg de presunto,\n%.1fKg de hamburguer.",sanduiche,queijo,presunto,hamburguer);


    }
}
