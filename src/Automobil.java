public class Automobil {

    private static final Integer brojKotaca = 4;
    private final String marka;
    private final String brSasije;

    public Automobil(String marka, String brSasije) {
        this.marka = marka;
        this.brSasije = brSasije;
    }

    public static Integer getBrojKotaca() {
        return brojKotaca;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getBrSasije() {
        return this.brSasije;
    }

    @Override
    public String toString() {
        return this.brSasije + " " + this.marka;
    }
}
