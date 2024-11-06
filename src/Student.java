public class Student extends Osoba {
    private final String brojIndeksa;
    private double prosjekOcjena;

    public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
        super(ime, prezime);
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public Student kloniraj() {
        return new Student(this.getIme(), this.getPrezime(), this.brojIndeksa, this.prosjekOcjena);
    }

    public double getProsjekOcjena() {
        return this.prosjekOcjena;
    }

    public void setProsjekOcjena(double prosjekOcjena) {
        this.prosjekOcjena = prosjekOcjena;
    }

    public void ispisiSveVrijednosti() {
        System.out.println("Ime: " + this.getIme());
        System.out.println("Prezime: " + this.getPrezime());
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Prosjek ocjena: " + this.prosjekOcjena);
    }
}