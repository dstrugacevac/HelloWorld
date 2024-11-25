import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kamion kamion = new Kamion();
        Auto auto = new Auto();
        List<Vozilo> vozila = new ArrayList<>();

        vozila.add(auto);
        vozila.add(kamion);

        for (Vozilo vozilo : vozila) {
            vozilo.pokreniSe();
        }
        
    }


}