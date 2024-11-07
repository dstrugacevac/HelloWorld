public class Zaposlenik extends Osoba {

    private final String pozicija;

    private final Integer godineIskustva;

    private final String nazivFirme;

    public Zaposlenik(String ime, String prezime, String pozicija, Integer godineIskustva, String nazivFirme) {
        super(ime, prezime);

        this.pozicija = pozicija;
        this.godineIskustva = godineIskustva;
        this.nazivFirme = nazivFirme;
    }

    public String getPozicija() {
        return this.pozicija;
    }

    public Integer getGodineIskustva() {
        return godineIskustva;
    }

    public String getNazivFirme() {
        return nazivFirme;
    }

    public void testnaFunkcija() {
        System.out.println("TEST Zaposlenik");
    }
}
