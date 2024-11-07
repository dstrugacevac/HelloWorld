public abstract class Oblik {

    private double povrsina;

    public double getPovrsina() {
        return this.povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public abstract double izracunajPovrsinu();

    public void ispisiPodatke() {
        System.out.println("test");
    }

}
