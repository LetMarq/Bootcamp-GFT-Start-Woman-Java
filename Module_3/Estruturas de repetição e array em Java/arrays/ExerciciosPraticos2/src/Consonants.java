import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consonants = new String[6];
        int quantityConsonants = 0;
        int count = 0;

        do {
            System.out.println("Letter:");
            String letter = scanner.next();

            if (!(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))) {
                consonants[count] = letter;
                quantityConsonants++;
            }
            count++;
        } while (count < consonants.length);

        System.out.println("Consonants: " + quantityConsonants);
        for (String consonant : consonants)
            if (consonant != null){
                System.out.print(" "+ consonant);
            }
    }


}
