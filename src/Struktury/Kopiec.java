package Struktury;



public class Kopiec {

    int _data[];
    int _counter;

    public Kopiec (int n) {
        _data = new int[n];
        _counter = 0;
    }

    public void insertElement(int element){
        int i = _counter++;
        int j = Math.floorDiv((_counter -1),2);

        while(i > 0 && _data[j] < element){
            _data[i] = _data[j];
            i = j;
            j = Math.floorDiv((i -1),2);
        }
        _data[i] = element;

    }

    public int deleteRoot(){        //usuwanie elementu ze szczytu kopca
        int root = -1;
        int lastElement = -1;
        int i = 0;
        int j = 0;

        if(_counter > 0){
            _counter--;
            lastElement = _data[_counter];
            i = 0;
            j = 1;
            root=_data[0];
            while (j < _counter){

                if((j + 1 < _counter) && (_data[j + 1] > _data[j])){
                    j = j + 1;
                }
                if(lastElement >= _data[j]){
                    break;
                }
                _data[i] = _data[j];
                i = j;
                j = 2 * j + 1;
            }

            _data[i] = lastElement;
        }
        return  root;
    }

    public void sortKopiec() {
        int size = _counter;
        int[] sort = new int[_counter];
        int it=_counter;

        for(int i = 0; i < it; i++){
            sort[i] = deleteRoot();
        }

        for (Integer i:sort) {
            System.out.println(i);

        }

    }


    public void printElement(){
        for (int i =0; i<_data.length;i++)
        {
            System.out.println(_data[i]);
        }
    }
}




