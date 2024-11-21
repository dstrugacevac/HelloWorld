import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidIntegerException {
        Razred razred = new Razred("1B", "Petar");
        int brojUcenika;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Upisite koliko ucenika zelite unijeti: ");
        String unesenaVrijednost = scanner.nextLine();
        brojUcenika = convertToInteger(unesenaVrijednost);
        if (brojUcenika < 0) {
            throw new InvalidIntegerException("Broj ne moze biti negativan!");
        }


        for (int i = 0; i < brojUcenika; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Upisite ime ucenika: ");
            String ime = scanner.nextLine();

            System.out.println("Upisite prezime ucenika: ");
            String prezime = scanner.nextLine();

            System.out.println("Upisite ocjenu ucenika: ");
            Integer ocjena = scanner.nextInt();

            Ucenik ucenik = new Ucenik(ime, prezime, ocjena);
            razred.dodajUcenika(ucenik);
        }

        for (Ucenik ucenik : razred.getUcenici()) {
            ucenik.ispisiInfo();
        }
    }

    private static Integer convertToInteger(String string) {
        try {
            Integer rezultat = Integer.parseInt(string);
            return rezultat;

        } catch (NumberFormatException e) {
            throw new StringCantBeParsedToIntegerException("Niste upisali ispravan broj!");
        }
    }
}