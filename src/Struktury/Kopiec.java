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
    public void printElement(){
        for (int i =0; i<_data.length;i++)
        {
            System.out.println(_data[i]);
        }
    }
}




