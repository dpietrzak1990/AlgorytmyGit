package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class Dominanta extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "dominanta";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;
        int[] T = new int[n];
        int max = 0;
        for (int i = 0; i < T.length; i++) {
            T[i] = Integer.parseInt(input[i + 1]);
            if (T[i] > max)
            max = T[i];
        }

        int[] L = new int[max + 1];
        for (int i = 0;i < T.length; i++) {
            int temp = T[i];
            L[temp]++;
        }

        int wynik=0;
        for(int i = 0; i < L.length; i++) {
            if(L[i] > L[wynik])
                wynik = i;
        }

        System.out.printf("Dominanta wynosi: %d", wynik);
    }


}

