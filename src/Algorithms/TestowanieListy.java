package Algorithms;

import Struktury.mList;

/**
 * Created by RENT on 2017-08-01.
 */
public class TestowanieListy extends  AbstractAlgorithm {
    @Override
    public String getName() {
        return "Testowanie listy";
    }

    @Override
    public void runAlgorithm(String[] input) {
        mList lista = new mList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addElementBeforeElement(45, 14, lista);
        lista.printAllElements(lista);

    }
}
