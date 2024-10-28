

public class Main {
    public static void main(String[] args) {

        String nekiString = "Ovo je testni primjerak stringa 1.2";
        Integer brojacSlova = 0;

        for (int i= 0; i < nekiString.length(); i ++){
            char character = nekiString.charAt(i);
            boolean daLiJeSlovo =  Character.isLetter(character);
            boolean daLiJeBroj =  Character.isDigit(character);
            String stringCharacter = String.valueOf(character);

            if (stringCharacter.equals(" ")){
                continue;
            }

            if (daLiJeSlovo==true){
                System.out.println(character + " Slovo");
                brojacSlova++;
            } else if (daLiJeBroj==true) {
                System.out.println(character + " Broj");
            } else {
                System.out.println(character + " Znak");
            }
        }

        System.out.println(brojacSlova);
    }
}