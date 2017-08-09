package Algorithms;

/**
 * Created by RENT on 2017-08-09.
 */
public class najmniejszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Najmniejsza Wspolna Wielokrotnosc";
    }

    @Override
    public void runAlgorithm(String[] input) {
            int k = Integer.parseInt(input[1]);
            int n = Integer.parseInt(input[2]);

        System.out.println(najmniejszaWspolnaWielokrotnosc(k,n));
    }

    private int NajwiekszyWspolnyDzielnik(int k, int n) {
        if(k ==0)
            return n;

        return NajwiekszyWspolnyDzielnik(n % k,k);

    }

    private int najmniejszaWspolnaWielokrotnosc(int k, int n) {

       return  (k*n/(NajwiekszyWspolnyDzielnik(k, n)));
    }
}


