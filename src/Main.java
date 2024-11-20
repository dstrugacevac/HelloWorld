import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("myfile.txt");
        File outputFile = new File("outagain.txt");

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(inputFile);
            out = new FileWriter(outputFile);

            int i = 0;

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println("ASCII znakova u fileu je: " + c);
            }


            System.out.println("Broj znakova u fileu je: " + i);
            in.close();
            out.close();
        } catch (FileNotFoundException error) {
            System.out.println("File nije pronaden." + error.getMessage());
        } catch (IOException error) {
            System.out.println("Dogodila se IO greska." + error.getMessage());
            throw error;
        }
        IOException nekiError = new IOException();
        throw nekiError;
    }


    private void zapisiUDatoteku(String zapis) {
        File outputFile = new File("outagain.txt");

        try {
            FileWriter out = new FileWriter(outputFile);
            out.write(zapis);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}