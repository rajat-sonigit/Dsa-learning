import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  factorial = sc.nextInt();
        System.out.println("Amount after 10 percent discount is- ");
       int  discount = (factorial * 10) / 100;
       int discountprize = factorial - discount;
       System.out.println(discountprize);
        sc.close();
    }
}
