public class Osoba {
    private final String prezime;
    private String ime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void definirajMe() {
        System.out.println("Ja sam osoba.");
    }

    public void ispisiVrijednostiOsobe() {
        System.out.println(this.getIme() + " " + this.getPrezime());
    }
}
