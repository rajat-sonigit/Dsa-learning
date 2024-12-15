import java.util.Scanner;

public class tillzerosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int number; // To store the current input number
        
        System.out.println("Enter numbers to add to the sum (enter 0 to stop):");
        
        while (true) {
            number = sc.nextInt(); // Take input from the user
            if (number == 0) { // Check if the user entered 0
                break; // Exit the loop
            }
            if (number > largest) {
                largest = number;
            }
            // Add the number to the sum
        }
        
        System.out.println("The sum of all numbers is: " + largest);
        sc.close(); // Close the scanner
    }
}
