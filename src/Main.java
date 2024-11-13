import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Unesite broj: ");
        int broj;

        boolean ispravanUnos = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                broj = scanner.nextInt();
                System.out.println("Unijeli ste: " + broj);
                ispravanUnos = true;
            } catch (Exception e) {
                System.out.println("Greška: Unos mora biti cijeli broj.");
                broj = 1;
            }

        } while (!ispravanUnos);

        Integer kvadrat = broj * broj;

        System.out.println("Kvardat je:" + kvadrat);
    }
}