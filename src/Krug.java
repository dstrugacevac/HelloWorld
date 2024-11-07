public class Krug extends Oblik {

    private final double radijus;

    public Krug(double radijus) {
        this.radijus = radijus;
    }

    public void ispisiPodatke() {
        System.out.println("Ja sam krug.");
        System.out.println("Povrsina je : " + this.getPovrsina());
        System.out.println("Radijus je : " + this.radijus);
        System.out.println(" ");
    }

    public double getRadijus() {
        return radijus;
    }

    @Override
    public double izracunajPovrsinu() {
        double povrsina = Math.PI * this.radijus * this.radijus;
        this.setPovrsina(povrsina);
        return povrsina;
    }

}
