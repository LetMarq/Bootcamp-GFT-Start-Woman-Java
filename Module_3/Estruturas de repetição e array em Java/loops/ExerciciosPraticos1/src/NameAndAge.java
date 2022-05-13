import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String name;
            int age;
            System.out.println("Name:");
            name = scan.next();
            if (name.equals("0")) {
                break;
            }
            System.out.println("Age:");
            age = scan.nextInt();
        }
        System.out.println("Quitting program...");


    }
}
