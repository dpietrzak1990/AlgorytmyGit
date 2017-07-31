package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class WyszukajMinMax extends  AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyszukujemy wartosci min i max";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;
        int max = 0;
        int min = 0;
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(input[i+1]);
            if (myArray[i] > myArray[max])
                max = i;
            if (myArray[i] < myArray[min])
                min =i;
        }

        System.out.println(max);
        System.out.println(min);

    }
}
