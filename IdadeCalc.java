import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//S007 Entrar com o ano de nascimento de uma
//pessoa e o ano atual e, ao final imprimir a idade
//da pessoa.
public class IdadeCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Digite o ano de seu nascimento");
        int nasc = input.nextInt();
        System.out.println("Digite o ano atual");
        int ano = input.nextInt();
        int idade = ano - nasc;
        System.out.printf("Você tem %d anos!", idade);
        */
        System.out.println("Digite o dia de seu nascimento:");
        int dia = input.nextInt();
        System.out.println("Digite o mês de seu nascimento(Número):");
        int mes = input.nextInt();
        System.out.println("Digite o ano de seu nascimento:");
        int ano = input.nextInt();
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int idade = year - ano;
        if (month > mes) {
            System.out.printf("Sua idade é %d", idade);
        }
        else {
            if (month == mes){
                if (day >= dia){
                    System.out.printf("Sua idade é %d", idade);
                }
                else {
                    --idade;
                    System.out.printf("Sua idade é %d", idade);
                }
            }
            else {
                --idade;
                System.out.printf("Sua idade é %d", idade);
            }
        }

    }
}
