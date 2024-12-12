import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        
        // Use double to support decimal values for radius
        double radius = sc.nextDouble();
        
        // Calculate the area of the circle
        double area = Math.PI * radius * radius; 
        
        // Print the area
        System.out.println("The area of the circle is: " + area);
        
        sc.close();
    }
}
