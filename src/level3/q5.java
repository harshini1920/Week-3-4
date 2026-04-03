package level3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;
        int sum = 0;

        // Step 3: Use while loop
        while (originalNumber != 0) {
            // Step 4: Get last digit
            int digit = originalNumber % 10;

            // Step 5: Add cube of digit to sum
            sum = sum + (digit * digit * digit);

            // Step 6: Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Step 7: Check condition
        if (sum == number) {
            System.out.println("The number " + number + " is an Armstrong number");
        } else {
            System.out.println("The number " + number + " is not an Armstrong number");
        }

        sc.close();
    }

}
