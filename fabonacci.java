import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0 ;
        int c = 1 ;
        
        System.out.print(b+" "+c);
        for(int i = 0 ; i< a-2 ; i++){
          int d  = b+c;
          System.out.print(" "+d);
          b = c;
          c = d;
        }
        scanner.close();
    }
}
