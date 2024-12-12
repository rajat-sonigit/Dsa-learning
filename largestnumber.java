import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        int a  = me.nextInt();
        int b  = me.nextInt();
        int c  = me.nextInt();
        // int largest;
        // if (a> b && a > c) {
        //     largest = a;
        // } else if (b > a) {
        //     largest = b;
        // } else {
        //     largest = c;
        // }

        // Print the result
        // System.out.println("The largest number is: " + largest);

        int u = Math.max(c, Math.max(a, b));
        System.err.println(u);
        me.close();;
    }
}
