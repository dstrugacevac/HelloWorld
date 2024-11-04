import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal prviBroj = BigDecimal.valueOf(10);
        BigDecimal drugiBroj = BigDecimal.valueOf(6);
        BigDecimal treciBroj = BigDecimal.valueOf(8);

        BigDecimal provjera = prviBroj.add(drugiBroj).multiply(treciBroj);
        BigDecimal zbroj = provjera.add(drugiBroj); // zbraja prvi s drugim brojem
        BigDecimal razlika = provjera.subtract(drugiBroj); // oduzima se drugi broj od prvog
        BigDecimal umnozak = provjera.multiply(drugiBroj); // mnozenje prvog broja s drugim
        BigDecimal kolicnik = provjera.divide(drugiBroj, 8, RoundingMode.HALF_UP); // dijeljenje prvog broja s drugim

        System.out.println("Zbroj: " + zbroj);
        System.out.println("Razlika: " + razlika);
        System.out.println("Umnozak: " + umnozak);
        System.out.println("Kolicnik: " + kolicnik);
        System.out.println("Provjera: " + provjera);
    }
}