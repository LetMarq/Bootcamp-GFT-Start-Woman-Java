import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantityNumber;
        System.out.println("How many numbers numbers: ");
        quantityNumber = scan.nextInt();
        int i =0;
        int number;
        int odd = 0, even = 0;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();
            i++;
            if(number % 2 ==0) even++;
            else odd++;

        }while (i< quantityNumber);

        System.out.println("Even: " + even + " || Odds: " + odd);
        
    }
}
