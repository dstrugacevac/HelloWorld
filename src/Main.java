public class Main {
    public static void main(String[] args) {
        Razred razred = new Razred("1B", "Petar");

        Ucenik ucenik1 = new Ucenik("Ana", "Anic");
        razred.dodajUcenika(ucenik1);

        Ucenik ucenik2 = new Ucenik("Ivan", "Ivic");
        razred.dodajUcenika(ucenik2);

        for (Ucenik ucenik : razred.getUcenici()) {
            ucenik.ispisiInfo();
        }
    }
}