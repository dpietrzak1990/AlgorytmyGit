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
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
