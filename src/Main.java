import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("myfile.txt");
        File outputFile = new File("outagain.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int i = 0;

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
            i++;
            System.out.println("ASCII znakova u fileu je: " + c);
        }


        System.out.println("Broj znakova u fileu je: " + i);
        in.close();
        out.close();
    }
}