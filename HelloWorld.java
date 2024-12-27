import java.util.Scanner;
// the conditionals
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a > 0 ) {
            int rem = a%10;
            
            a = a/10;
            System.out.println(rem);
        }
    } 
}

// import java.util.Scanner;

// public class HelloWorld {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Please enter your first number: ");
//         int a = scanner.nextInt();

//         System.out.println("Please enter your second number: ");
//         int b = scanner.nextInt();

//         System.out.println("Please enter your third number: ");
//         int c = scanner.nextInt();

//         if (a > b && a > c) {
//             System.out.println(a + " is the largest number");
//         } else if (b > a && b > c) {
//             System.out.println(b + " is the largest number");
//         } else {
//             System.out.println(c + " is the largest number");
//         }

//         scanner.close(); // Close the scanner to prevent resource leak
//     }
// }


// fabonaci 
// System.out.println("enter 3 number ");
// Scanner scanner = new Scanner(System.in);
// int a = scanner.nextInt();
// int c = 1 ; 
// int b = 0 ;
// int count = 2;
// while (count<= a) {
//     int temp = c ;
//     c = b + c;
//     b = temp;
//     count++;
//     System.out.print(","+b);
    
// }


// to check number of digit occuring i number
// System.out.println("enter a number ");
// Scanner scanner = new Scanner(System.in);
// int a = scanner.nextInt();
// int count = 0;
// while (a > 0 ) {
//     int rem = a%10;
//     if (rem == 7) {
//         count++;
//     }

//     a = a/10;
// }
// System.out.println(count);



// to find the reverse of the number 
// System.out.println("enter a number ");
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         while (a > 0 ) {
//             int rem = a%10;
            
//             a = a/10;
//             System.out.println(rem);
//         }
