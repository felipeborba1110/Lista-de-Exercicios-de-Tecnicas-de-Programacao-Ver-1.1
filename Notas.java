import java.util.Scanner;

public class Notas {
//S031 Fazer um algoritmo que leia três notas e mostre:
//- a média das notas
//- a situação final do aluno
//onde :
//- aprovado - media >= 7
//- prova final - media > = 4 e media < 7
//- reprovado - media < 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1º nota do aluno:");
        int num1 = input.nextInt();
        System.out.println("Digite a 2º nota do aluno:");
        int num2 = input.nextInt();
        System.out.println("Digite a 3º nota do aluno:");
        int num3 = input.nextInt();
        int media = (num1 + num2 + num3)/3;
        System.out.printf("A média das notas do aluno é %d\n", media);
        if (media >= 7) {
            System.out.print("Aluno Aprovado!");
        }
        else {
            if (media >= 4) {
                System.out.print("Aluno deve fazer a Prova Final!");
            }
            else {
                System.out.print("Aluno Reprovado!");
            }
        }
    }
}
