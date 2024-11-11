import java.math.BigDecimal;

public class Stalni extends Zaposlenik {

    private final double POSTOTAK_BONUSA = 0.15;

    public Stalni(String ime, BigDecimal placa, Double brojRadnihSati) {
        super(ime, placa, brojRadnihSati);
    }

    @Override
    public BigDecimal izracunPlace() {

        if (getBrojRadnihSati() > 160) {
            BigDecimal bonus = getPlaca().multiply(BigDecimal.valueOf(POSTOTAK_BONUSA));
            setPlaca(getPlaca().add(bonus));
        }

        return getPlaca();
    }
}