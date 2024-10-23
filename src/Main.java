import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2. Zadatak. Od korisnika trazite unos 10 brojeva te u listi pronadite koji broj se najvise puta ponavlja.
// Za rezultat ispisite broj koji se najvise puta ponavljao u listi te koliko se puta pojavio u listi.
// Treba uzeti u obriz i kada su svi brojevi razliciti.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite 10 brojeva:");
        for (int i = 0; i < 10; i++) {
            brojevi.add(scanner.nextInt());
        }
        
        int najcesciBroj = brojevi.get(0);
        int maxPonavljanja = 1;

        for (int i = 0; i < brojevi.size(); i++) {
            int trenutniBroj = brojevi.get(i);
            int brojPonavljanja = 0;

            for (int j = 0; j < brojevi.size(); j++) {
                if (brojevi.get(j) == trenutniBroj) {
                    brojPonavljanja++;
                }
            }

            if (brojPonavljanja >= maxPonavljanja) {
                maxPonavljanja = brojPonavljanja;
                najcesciBroj = trenutniBroj;
            }
        }

        if (maxPonavljanja==1){
            System.out.println("Svi brojevi su razliciti.");
        }else {
            System.out.println("Broj koji se najviše puta ponavljao: " + najcesciBroj);
            System.out.println("Ponavlja se " + maxPonavljanja + " puta.");
        }
    }
}