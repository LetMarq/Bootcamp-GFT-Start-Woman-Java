import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Factorial: ");
        int factorial = scan.nextInt();
        int multiplier = 1;
        System.out.print(factorial+"! = ");
        for(int i = factorial; i>=1; i--){
            multiplier = multiplier*i;
        }
        System.out.println(multiplier);
    }
}
