public class Profesor extends Osoba {

    private final Integer godineIskustva;

    public Profesor(String ime, String prezime, Integer godineIskustva) {
        super(ime, prezime);
        this.godineIskustva = godineIskustva;
    }

    public Integer getGodineIskustva() {
        return godineIskustva;
    }
}
