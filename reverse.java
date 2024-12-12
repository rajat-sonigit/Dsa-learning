import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int b;
        for(int i = 0 ; i<number;i++ ){
            b = number%10;
            number = number/10;
            System.err.print(b);
         
        }
        sc.close();
    }

}
