import java.util.Scanner;

public class tillzerosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int number; 
        
        System.out.println("Enter numbers to add to the sum (enter 0 to stop):");
        
        while (true) {
            number = sc.nextInt();
            if (number == 0) { 
                break; 
            }
            if (number > largest) {
                largest = number;
            }
            
        }
        
        System.out.println("The sum of all numbers is: " + largest);
        sc.close(); // Close the scanner
    }
}
