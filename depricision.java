import java.util.Scanner;

public class depricision {
    public static void main(String[] args) {
        int currentyear = 2024;
        System.out.println("Enter the price of product");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("Enter the year to know future price");
        int futureyear = sc.nextInt();
        int yeargap = futureyear-currentyear;
        for(int i = 0;i< yeargap;i++ ){
          int depricision = (price*80)/100;
          price = price - depricision;
        }
        System.out.println(price);
        sc.close();
    }
}
