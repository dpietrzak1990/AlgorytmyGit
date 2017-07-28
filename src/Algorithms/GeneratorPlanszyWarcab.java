package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class GeneratorPlanszyWarcab extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "generator planszy warcab";
    }


    @Override
    public void runAlgorithm(String[] input) {

        String kolory[] = {"C", "B"};
        int wiersze = Integer.parseInt(input[1]);
        int kolumny = Integer.parseInt(input[2]);

        String warcaby[][] = new String[wiersze][kolumny];

        int licznik;
        if (input[3].equals("C")) {
            licznik = 0;
        } else {
            licznik = 1;
        }

        for (int m = 0; m < wiersze; m++) {
            for (int n = 0; n < kolumny; n++) {
                if (licznik % 2 == 0) {
                    warcaby[m][n] = "B";
                }else {
                    warcaby[m][n] = "C";
                }
                licznik++;
            }
            }
        for (int m = 0; m < wiersze; m++){
            for (int n = 0; n < kolumny; n++) {
                System.out.printf("%s ", warcaby[m][n]);
            }
            System.out.printf("\n");
        }
    }
}