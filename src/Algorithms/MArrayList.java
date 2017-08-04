package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class MArrayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Array List";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelete = Integer.parseInt(input[1]);

        ArrayList<Integer> lista = new ArrayList();

        for (int i = 2; i < input.length; i++) {
            lista.add(Integer.parseInt(input[i]));
        }
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) == toDelete ) {
                lista.remove(i);
                i=0;
            }
        }

        for (Integer i:lista) {
            System.out.println(i);
        }
    }
}
