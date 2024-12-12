import java.util.Scanner;

public class numbercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int b;int count = 0 ;
        for(int i = 0 ; i<=number;i++ ){
            b = number%10;
            if (b ==3) {
                count++;
            }
            number = number/10;
         
        }
        System.err.print(count);
        sc.close();
    }
}
