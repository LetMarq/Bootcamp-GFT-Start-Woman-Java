public class ReverseOrder {
    public static void main(String[] args) {
        int[] vetor = {1, 7, 28, -6, 83, 1};
        int counter = vetor.length - 1;

        while (counter >= 0 ) {
            System.out.print(vetor[counter]+ " ");
            counter --;
        }

    }
}
