import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Enter the heght and the breath");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         // area of triangle 
         
         double area = a *b* 0.5;
        System.out.println(area);
        sc.close();
    }
}
