import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int temp = sc.nextInt();
        int a = temp;
        int b ;
        int reverse = 0;
        while (temp>0) {
            b = temp%10;
         reverse = reverse *10 + b;
         temp = temp/10;
        }
        if (reverse == a) {
            System.out.println("Its an palindrome number");
        } else{
            System.out.println("Its not an palindrome number");
        }
        sc.close();
    }
}
