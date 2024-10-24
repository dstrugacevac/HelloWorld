import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tražiti od korisnika da unese broj elemenata u listi te popuni elemente liste.
//Nakon toga pretražiti po listi da li postoji ijedan duplikat, ukoliko postoji ispisi vrijednost true, ukoliko ne postoji ispisi vrijednost false.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            List<Integer> brojevi = new ArrayList<>();

            System.out.println("Unesite broj elemenata: ");
            int brojElemenata = scanner.nextInt();

            for (int i = 0; i < brojElemenata; i++) {
                System.out.println("Unesite željeni broj: ");
                brojevi.add(scanner.nextInt());
            }
            // 1, 6, 54, 23, 4
            // 1, 6, 54, 23, 4

            Boolean duplikat = false;

            for (int i = 0; i < brojevi.size(); i++){
                int trenutniBroj = brojevi.get(i);

                for (int j = 0; j < brojevi.size(); j++) {
                    if (i != j) {
                        if (brojevi.get(j) == trenutniBroj) {
                        System.out.println("True");
                        duplikat = true;
                        break;
                        }
                    }
                }

                if (duplikat== true){
                    break;
                }

            }

            if (duplikat == false){
                System.out.println("False");
            }
        }
}