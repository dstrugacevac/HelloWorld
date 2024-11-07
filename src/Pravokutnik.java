public class Pravokutnik extends Oblik {

    private final double sirina;

    private final double visina;

    public Pravokutnik(double visina, double sirina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    @Override
    public double izracunajPovrsinu() {
        double povrsina = this.visina * this.sirina;
        this.setPovrsina(povrsina);
        return povrsina;
    }


}
