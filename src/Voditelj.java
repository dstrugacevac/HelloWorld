public class Voditelj extends Zaposlenik {

    private final String odjel;

    public Voditelj(String ime, String prezime, String pozicija, Integer godineIskustva, String nazivFirme, String odjel) {
        super(ime, prezime, pozicija, godineIskustva, nazivFirme);

        this.odjel = odjel;
    }

    public String getOdjel() {
        return odjel;
    }

    public void testnaFunkcija() {
        System.out.println("TEST Voditelj");
    }
}
