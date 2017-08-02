package Algorithms;

/**
 * Created by RENT on 2017-08-02.
 */
public class ProsteDrzewo extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Prosste Drzewo";
    }

    String _tree[];
    int _level;
    int _height;

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length-1;
        _tree = new String[getArraySize(n)];
        int i;

        for(i = 0;i < n; i++){
            _tree[i] = input[i+1];
        }

        for(int j = i; j < _tree.length; j++){
            _tree[j] = "AA";
        }

        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.printf("Wysokosc drzewa: %d\n", _height);

        System.out.printf("Korzeniem jest: %s\n", _tree[0]);

        for(int j = 0; j < _tree.length; j++) {
            String elementLewy = "";
            String element = "";
            try {
                element = _tree[j];
                elementLewy = _tree[2*j+1];

            }
            catch (Exception ex) {
                System.out.printf("Element %s jest lisciem\n", element);
            }
        }
        getSons("A");
        getSons("E");
    }

    private int getArraySize(int n) {
        int currentSize = 0;
        int iterator = 0;
        while (currentSize < n) {
            currentSize = currentSize + (int)Math.pow(2d, (double)iterator );
            iterator++;
        }
        _level = iterator-1;
        _height = iterator;
        return currentSize;
    }

    private void getSons(String father){
        int i = 0;
        for(i = 0; i < _tree.length; i++){
            if(_tree[i].equals(father))
                break;
        }

        try{
            System.out.printf("Lewym synem" + "elementu %s jest: %s\n", _tree[i], _tree[2*i+1]);
            System.out.printf("Prawym synem" + "elementu %s jest: %s\n", _tree[i], _tree[2*i+2]);
        }
        catch (Exception ex) {
            System.out.printf("Element %s nie posiada syna", _tree[i]);
        }
    }
}
