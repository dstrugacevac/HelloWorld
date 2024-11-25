public class Auto implements Vozilo {

    @Override
    public void pokreniSe() {
        System.out.println("Auto se pokrece...");
    }

    @Override
    public void parkirajSe() {
        System.out.println("Auto se parkira...");
    }

    @Override
    public void zaustaviSe() {
        System.out.println("Auto se zaustavlja...");
    }
}
