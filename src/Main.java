import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Automobil>> sviAutobomili = new ArrayList<>();

        HashMap<String, List<Automobil>> automobiliGrupiraniPoBoji = new HashMap<>();

        Automobil automobil1 = new Automobil("Audi", "GUOFZE3298423");
        Automobil automobil2 = new Automobil("Mercedes", "HGFDSZ82432BJ");
        Automobil automobil3 = new Automobil("BMW", "DVHABJSKPOĆ6312");
        Automobil automobil4 = new Automobil("Fiat", "GFASDVH743218VSAD");
        Automobil automobil5 = new Automobil("Opel", "KJNG58U94T5HGBDSF");

        List<Automobil> bijeliAutomobili = new ArrayList<>();
        bijeliAutomobili.add(automobil1);
        bijeliAutomobili.add(automobil4);

        List<Automobil> crniAutomobili = new ArrayList<>();
        crniAutomobili.add(automobil2);
        crniAutomobili.add(automobil5);

        List<Automobil> crveniAutomobili = new ArrayList<>();
        crveniAutomobili.add(automobil3);

        automobiliGrupiraniPoBoji.put("Bijela", bijeliAutomobili);
        automobiliGrupiraniPoBoji.put("Crna", crniAutomobili);
        automobiliGrupiraniPoBoji.put("Crvena", crveniAutomobili);

        sviAutobomili.add(crniAutomobili);
        sviAutobomili.add(bijeliAutomobili);
        sviAutobomili.add(crveniAutomobili);

        System.out.println(automobiliGrupiraniPoBoji);
    }
}