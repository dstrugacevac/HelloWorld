public class Ucenik {

    private String ime;
    private String prezime;

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Zovem se: " + this.ime + " " + this.prezime;
    }

    public void ispisiInfo() {
        System.out.println("Zovem se: " + this.ime + " " + this.prezime);
    }
}
