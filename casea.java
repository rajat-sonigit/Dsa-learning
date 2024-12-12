import java.util.Scanner;

public class casea {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char a = scanner.next().trim().charAt(0);
    if (a >= 'a' && a <= 'z'){
        System.out.println("its in the lower case ");
    }else {
        System.out.println("its in the upper case");
    }
}
}
