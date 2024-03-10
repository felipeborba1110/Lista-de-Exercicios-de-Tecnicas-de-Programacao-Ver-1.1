import java.util.Scanner;

//S018 Um motorista deseja colocar no tanque de seu veículo X reais de gasolina. Escreva um
//algoritmo para ler o preço do litro da gasolina e o valor do combustível, e exibir quantos
//litros ele conseguiu colocar no tanque.
public class PostoGasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o preço do litro da gasolina:");
        float gasolina = input.nextFloat();
        System.out.println("Quanto deseja pagar:");
        float preco = input.nextFloat();
        float total = preco / gasolina;
        System.out.println("Com este valor é possivel colocar " + total + " litros!");
    }
}
