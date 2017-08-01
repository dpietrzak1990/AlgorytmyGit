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

        int a = rok % 100;
        int b = (int) rok / 100;
        int c = rok % 100;
        float d1 = (rok / 100) / 4;
        int d = (int) d1;
        int e = d % 4;
        float f1 = ((b + 8) / 25);
        int f = (int) f1;
        float g1 = ((b - f + 1) / 3);
        int g = (int) g1;
        int h = (19 * a + b - d - g + 15) % 30;
        float i1 = (rok % 100) / 4;
        int i = (int) i1;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        float m1 = (a + 11 * h + 22 * l) / 451;
        int m = (int) m1;
        int p = (h + l - 7 * m + 114) % 31;

        int DzienWielkanocy = p + 1;
        float MiesiacWielkanocy = ((int) (h + l - 7 * m + 114) / 31);


        if(MiesiacWielkanocy == 4) {
            System.out.println(DzienWielkanocy + " kwiecien");
        }else {
            System.out.println(DzienWielkanocy + "marzec");


        }
    }
}
