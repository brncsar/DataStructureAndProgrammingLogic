// Create a series loop defining the number of series, set the initial value of A, which will be multiplied by B, and N is equal to the number of repetitions. The formula is (a + 2^0 * b), ...

import java.util.Scanner;

public class SeriesLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of series");
        int q = scanner.nextInt();


        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();


            int term = a;
            for (int j = 0;j < n; j++) {
                term += (int) (Math.pow(2, j) * b);
                System.out.print(term + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
