package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Krzyzowka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "krzyzowka";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "W", "V", "X",
            "Y", "Z"}; //Tablica literek, która prezentuje nasz alfabet

    @Override
    public void runAlgorithm(String[] input) {

        int sqrt = Integer.parseInt(input[1]);
        if (Math.sqrt(sqrt) % 1 == 0) {
            int rozmiar = (int) Math.sqrt(sqrt);
            String krzyzowka[][] = new String[rozmiar][rozmiar];
            for (int i = 0; i < rozmiar; i++) {
                for (int j = 0; j < rozmiar; j++) {
                    krzyzowka[i][j] = _letters[i] + String.valueOf(j + 1);
                }
            }
            for (int i = 0; i < rozmiar; i++) {
                for (int j = 0; j < rozmiar; j++) {
                    System.out.printf("%s ", krzyzowka[i][j]);

                }
                System.out.printf("\n");
            }

        }

    }
}
