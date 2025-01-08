import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        // Ispisite element Šljiva ako postoji, ako ne postoji ispisite da šljiva ne postoji
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Kruška");
        hashSet.add("Jabuka");
        hashSet.add("Jagoda");
        hashSet.add("Šljiva");

        for (String elementSeta : hashSet) {
            System.out.println("HashSet: " + elementSeta);
        }

        hashSet.remove("Kruška");

        System.out.println("-------------------NAKON BRISANJA-----------------------");

        for (String elementSeta : hashSet) {
            System.out.println("HashSet: " + elementSeta);
        }

        if (hashSet.contains("Šljiva")) {
            System.out.println("Šljiva");
        } else {
            System.out.println("Šljiva ne postoji.");
        }


    }

}