import java.util.Scanner;

public class Note {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Note: ");
        int note = scanner.nextInt();
        while (note < 0 || note > 10){
            System.out.println("Invalid note! Please try again... ");
            note = scanner.nextInt();
        }
    }
}
