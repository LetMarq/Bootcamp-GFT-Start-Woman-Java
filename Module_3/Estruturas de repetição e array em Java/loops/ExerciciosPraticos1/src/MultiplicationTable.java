import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication table: ");
        int multTable = scanner.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(multTable + "X" + i + "=" + (i*multTable));
        }

    }
}
