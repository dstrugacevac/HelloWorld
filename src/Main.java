import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Napiši program koji od korisnika traži unos niza brojeva i sprema ih u List-u.
// Pronađi najmanji i najveći broj, zamijeni ih međusobno i ispiši novu List-u.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.print("Unesite veličinu liste: ");
        int velicinaListe = scanner.nextInt();

        System.out.println("Unesite " + velicinaListe + " brojeva:");

        for (int i = 0; i < velicinaListe; i++) {
            brojevi.add(scanner.nextInt());
        }

        int min = brojevi.get(0);
        int max = brojevi.get(0);

        for (int i = 1; i < brojevi.size(); i++) {
            if (brojevi.get(i) < min) {
                min = brojevi.get(i);
            }
            if (brojevi.get(i) > max) {
                max = brojevi.get(i);
            }
        }

        Integer indexMinBroja = brojevi.indexOf(min);
        Integer indexMaxBroja = brojevi.indexOf(max);

        brojevi.set(indexMinBroja, max);
        brojevi.set(indexMaxBroja, min);

        System.out.println("Nova lista nakon zamjene najmanjeg i najvećeg broja:");
        for (int broj : brojevi) {
            System.out.print(broj + " ");
        }
    }
}
