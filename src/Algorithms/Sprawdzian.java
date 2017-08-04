package Algorithms;

/**
 * Created by RENT on 2017-08-04.
 */
public class Sprawdzian extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sprawdzian";
    }

    @Override
    public void runAlgorithm(String[] input) {
        String kubaOdp = input[1];
        String zenekOdp = input[2];
        String bogdanOdp = input[3];

        if(!(kubaOdp.length() == zenekOdp.length()) &&
                !(kubaOdp.length() == bogdanOdp.length()))
        {
            System.out.println("Długości odpowiedzi się nie zgadzają!");
            return;
        }


        char[] kubaAnswersAsLetters = kubaOdp.toCharArray();
        char[] zenekAnswersAsLetters = zenekOdp.toCharArray();
        char[] bogdanAnswersAsLetters = bogdanOdp.toCharArray();

        int correctOdp = 0;

        for(int i = 0; i< kubaOdp.length(); i++)
        {
            if(kubaAnswersAsLetters[i] != zenekAnswersAsLetters[i])
                correctOdp++;

            if(kubaAnswersAsLetters[i] != bogdanAnswersAsLetters[i])
                correctOdp++;
        }

        System.out.printf("Ilość poprawnych odpowiedzi: %d", correctOdp);

    }
}




