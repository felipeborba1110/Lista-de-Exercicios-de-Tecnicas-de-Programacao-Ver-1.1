import java.util.Scanner;

//S022 Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
//mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado
//para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima" no
//sentido de que as notas de menor valor fossem distribuídas em número mínimo possível.
//Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar uma nota
//de R$ 50,00, três notas de R$ 10,00, uma nota de R$ 5,00 e duas notas de R$ 1,00.
//Escreva um programa que receba o valor da quantia solicitada e retorne a distribuição das
//notas de acordo com o critério da distribuição ótima.
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do saque:");
        int saque = input.nextInt();
        int fifty = saque/50;
        saque = saque-(fifty*50);
        int twenty = saque/20;
        saque = saque-(twenty*20);
        int ten = saque/10;
        saque = saque-(ten*10);
        int five = saque/5;
        saque = saque-(five*5);
        int two = saque/2;
        saque = saque-(two*2);
        int one = saque;
        System.out.println("Sera um saque de:\n" + fifty + " notas de cinquenta,\n" + twenty + " notas de vinte,\n"
                + ten + " notas de dez,\n" + five + " notas de cinco,\n" + two + " notas de dois,\n" + one + " moedas de um.");
    }
}
