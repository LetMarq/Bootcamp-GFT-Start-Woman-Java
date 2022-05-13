import java.util.Scanner;

public class AverageAndGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int biggest = 0;
        int counter = 0;
        float sum = 0;
        do {
            System.out.println("Number:");
            number = scanner.nextInt();
            sum = number + sum;
            if (number > biggest) {
                biggest = number;
            }counter++;
        } while (counter < 5);
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The median number is: " + sum/5);

    }
}
