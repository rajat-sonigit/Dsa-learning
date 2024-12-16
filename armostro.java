import java.util.Scanner;

public class armostro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int number = a;
        int b ;
        int cubesum = 0 ;
        while (a>0) {
         b  = a%10;
         cubesum = cubesum + b*b*b;
         a = a/10;        
        }
        
        System.out.println(cubesum);
       if (number == cubesum) {
        System.out.println("its an amrostry number");
       }else{
        System.out.println("its not");
       }
       sc.close();
    }
}
