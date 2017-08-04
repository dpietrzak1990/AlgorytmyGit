package Algorithms;

/**
 * Created by RENT on 2017-08-04.
 */
public class ZmienneITablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zmienne i tablice";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length-1;
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i=0; i<tab.length;i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    System.out.println("mamy duplikat " + i + " " + j + " " + tab[i] );
                    return;
                }
            }

        }

            System.out.println( "nie mamy duplikatu");
    }
}
