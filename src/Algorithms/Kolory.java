package Algorithms;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Kolory extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "dodajemy kolory";
    }

    @Override
    public void runAlgorithm(String[] input) {
        ArrayList<String> Kolory = new ArrayList<String>();
        Kolory.add("niebieski");
        Kolory.add("czarny");
        Kolory.add("zolty");
        Kolory.add("fioletowy");

        Kolory.add(0, "rozowy");
        Kolory.add(Kolory.size(), "zielony");

        for(String element : Kolory) {
            System.out.println(element);
        }
    }
}
