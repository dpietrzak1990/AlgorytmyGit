package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "SortowaniePrzezZliczanie";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 2;
        int max = Integer.parseInt(input[1]) + 1;
        int[] tabSparsowanychWejsc = new int[n];

        for (int i = 0; i < n; i++) {
            tabSparsowanychWejsc[i] = Integer.parseInt(input[i + 2]);
        }
        int[] tablicaDoZliczenia = new int[max];
        for(int i = 0; i < tabSparsowanychWejsc.length; i++) {
            int liczba = tabSparsowanychWejsc[i];
            tablicaDoZliczenia[liczba]++;
        }









    }
}
