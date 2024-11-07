import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Oblik> razniOblici = new ArrayList<>();

        Oblik pravokutnik = new Pravokutnik(3, 2);
        double povrsina = pravokutnik.izracunajPovrsinu();
        razniOblici.add(pravokutnik);

        Oblik krug = new Krug(5.7);
        double povrsinaKruga = krug.izracunajPovrsinu();
        razniOblici.add(krug);

        for (int i = 0; i < razniOblici.size(); i++) {
            razniOblici.get(i).ispisiPodatke();
        }
    }
}
