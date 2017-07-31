package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class DataWielkanocy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyznaczamy date wielkanocy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int rok = Integer.parseInt(input[1]);

        float a = rok % 100;
        float b1 = rok/100; /// rzutowania
        int b = (int)b1;
        float c = rok % 100;
        float d = (int)(b/100)/4;
        float e = d%4;
        //float f = (int)(())





    }
}
