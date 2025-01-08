import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> treeSetAsc = new TreeSet<>();

        treeSetAsc.add("Jabuka");
        treeSetAsc.add("Banana");
        treeSetAsc.add("Trešnja");
        treeSetAsc.add("Jagoda");
        treeSetAsc.add("Marelica");
        treeSetAsc.add("Višnja");
        treeSetAsc.add("Kiwi");

        System.out.println("--------------------------------");
        System.out.println("Eelementi u TreeSet-u ASC su: " + treeSetAsc);
        System.out.println("--------------------------------");

        treeSetAsc.remove("Trešnja");

        System.out.println("--------------------------------");
        System.out.println("Eelementi u TreeSet-u ASC su: " + treeSetAsc);
        System.out.println("--------------------------------");

        System.out.println("Prvi element u TreeSet-u je: " + treeSetAsc.first());
        System.out.println("Zadnji element u TreeSet-u je: " + treeSetAsc.last());

        TreeSet<String> treeSetDesc = new TreeSet<>(Comparator.reverseOrder());
        treeSetDesc.addAll(treeSetAsc);

        System.out.println("--------------------------------");
        System.out.println("Eelementi u TreeSet-u DESC su: " + treeSetDesc);
        System.out.println("--------------------------------");
    }

}