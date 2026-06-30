import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("\n===== Result =====");
        System.out.println("Maximum Value : " + max);
        System.out.println("Index       : " + maxIndex);

        input.close();
    }
}