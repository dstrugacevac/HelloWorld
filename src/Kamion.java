public class Kamion implements Vozilo {

    private String ime;

    public void pokreniSe() {
        System.out.println("Kamion se pokrece...");
    }

    public void parkirajSe() {
        System.out.println("Kamion se parkira...");
    }

    public void zaustaviSe() {
        System.out.println("Kamion se zaustavlja...");
    }

    public String getIme() {
        return this.ime;
    }
}
