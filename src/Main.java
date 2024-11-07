public class Main {
    public static void main(String[] args) {

        Zaposlenik zaposlenik = new Zaposlenik("Petar", "Peric", "Backend Developer", 3, "Algebra");
        System.out.println("Zaposlenik ime: " + zaposlenik.getIme());
        System.out.println("Zaposlenik godina iskustva: " + zaposlenik.getGodineIskustva());
        zaposlenik.testnaFunkcija();

        Voditelj voditelj = new Voditelj("Ime voditelja", "Maric", "Java developer", 5, "Algebra", "IT");
        System.out.println("Voditelj ime: " + voditelj.getIme());
        System.out.println("Voditelj godina iskustva: " + voditelj.getGodineIskustva());
        System.out.println("Voditelj odjjel: " + voditelj.getOdjel());
        voditelj.testnaFunkcija();
    }
}
