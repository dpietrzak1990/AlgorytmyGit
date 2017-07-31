package Algorithms;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class Pusty extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zadania doswiadczalne";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Random mRand = new Random(12);
        int[] liczby = new int[10];
        for(int i = 0; i < liczby.length; i++){
            liczby[i] = mRand.nextInt();          //mRand - liczby losowe
            System.out.printf("%d ",liczby[i]);
        }
        int[] parzyste = new int[10];
        for(int i =0, j=0; i < parzyste.length; i++, j=j+2) {
            parzyste[i] = j;

            System.out.println(parzyste[i]);
        }

    }
}
