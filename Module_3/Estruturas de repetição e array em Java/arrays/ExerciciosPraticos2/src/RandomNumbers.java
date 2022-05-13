import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatoryNumbers = new int[20];
        for (int i = 0; i < aleatoryNumbers.length; i++) {
            int number = random.nextInt(100);
            aleatoryNumbers[i] = number;
        }
        System.out.println("Aleatory Numbers: ");
        for (int number : aleatoryNumbers){
            System.out.print(number+ " ");
        }
        System.out.println("\nSuccessors of random numbers ");
        for (int number : aleatoryNumbers){
            System.out.print((number+1)+ " ");
        }

    }
}
