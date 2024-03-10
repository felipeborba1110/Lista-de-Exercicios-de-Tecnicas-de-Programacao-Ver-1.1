import java.util.Scanner;

//S030 Escreva um algoritmo para ler um valor inteiro em segundos, e depois converter e mostrálo no formato hh:mm:ss.
public class SegsToTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os segundos:");
        int seg = input.nextInt();
        int min = seg / 60;
        seg = seg - min*60;
        int hora = min / 60;
        min = min - hora*60;
        System.out.printf("%02d:%02d:%02d",hora,min,seg);
    }
}
