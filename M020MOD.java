package M020;

// M020 (MOD) Faça um algoritmo para preencher de forma randômica dois vetores V1 e V2 de 45 números cada
// entre 1 e 15. Calcular e escrever os números repetidos entre V1 e V2 e a posição que estes se encontram
// em cada vetor.

import java.util.*;
import java.util.stream.IntStream;

public class M020MOD {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 1;
        int times = 0;

        int[] V1 = new int[45];
        for (int i = 0; i < V1.length; i++) {
            V1[i] = random.nextInt(15) + 1;
        }

        int[] V2 = new int[45];
        for (int i = 0; i < V2.length; i++) {
            V2[i] = random.nextInt(15) + 1;
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("V1:" + Arrays.toString(V1));
        System.out.println("V2:" + Arrays.toString(V2));

        ArrayList<Integer> timesNum1 = new ArrayList<>();
        ArrayList<Integer> timesNum2 = new ArrayList<>();

        do {
            for (int j : V1) {
                if (j == num)
                    times++;
            }
            timesNum1.add(times);
            times = 0;
            num++;
        } while (num != 16);

        num = 1;
        do {
            for (int j : V2) {
                if (j == num)
                    times++;
            }
            timesNum2.add(times);
            times = 0;
            num++;
        } while (num != 16);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 15; i++) {
            int j = i + 1;
            System.out.printf("Há um total de %02d aparições do número %02d: V1:%s & V2:%s\n", timesNum1.get(i) + timesNum2.get(i) ,(i + 1), Arrays.toString(indexOfAll(V1, j)), Arrays.toString(indexOfAll(V2, j)));
        }
    }
    public static int[] indexOfAll(int[] array, int object) {
        List<Integer> list = new ArrayList<>();
        for (int j : array) list.add(j);
        return IntStream.range(0, list.size())
                .filter(i -> Objects.equals(object, list.get(i)))
                .toArray();
    }
}
