public class Student {
    private final String ime;
    private final String prezime;
    private final String brojIndeksa;
    private final double prosjekOcjena;

    public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public double getProsjekOcjena() {
        return this.prosjekOcjena;
    }


    public void ispisiSveVrijednosti() {
        System.out.println("Ime: " + this.ime);
        System.out.println("Prezime: " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Prosjek ocjena: " + this.prosjekOcjena);
    }

}