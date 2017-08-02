import Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "odejmowaniekwoty":
                return new OdejmowanieKwoty();
            case "sumaliczbwejsciowych":
                return new SumaLiczbWejsciowych();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "silnia":
                return new Silnia();
            case "fibonacci":
                return new Fibonacci();
            case "szyfrcezara":
                return new SzyfrCezara();
            case "wyznaczaniecyfrsilni":
                return new WyznaczanieCyfrSilni();
            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();
            case "sortowaniebabelkowe":
                return new SortowanieBabelkowe();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "krzyzowka":
                return new Krzyzowka();
            case "najwiekszywspolnydzielnik":
                return new NajwiekszyWspolnyDzielnik();
            case "generatorplanszywarcab":
                return new GeneratorPlanszyWarcab();
            case "dominanta":
                return new Dominanta();
            case "datawielkanocy":
                return new DataWielkanocy();
            case "pusty":
                return new Pusty();
            case "wyszukajminmax":
                return new WyszukajMinMax();
            case "lider":
                return new Lider();
            case "testowanielisty":
                return new TestowanieListy();
            case "kolory":
                return new Kolory();
            case "prostedrzewo":
                return new ProsteDrzewo();
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
