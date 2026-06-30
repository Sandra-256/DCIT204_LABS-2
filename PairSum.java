import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
             System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    
                    System.out.println("\n===== Pair Found =====");
                    System.out.println("Indices : " + i + " and " + j);
                    System.out.println("Values : " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found with the given target sum.");
        }

        input.close();
    }
    
}
