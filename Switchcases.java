import java.util.Scanner;
public class Switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.next().toLowerCase();
        switch (day) {
            case "sunday":
                System.out.println("hey its holiday day enjoy");
                break;
            case "monday":
                System.out.println("ohh a working day");
                break;
                case "tuesday":
                System.out.println("ohh a working day");
                break;
                case "wednesday":
                System.out.println("ohh a working day");
                break;
                case "thrusday":
                System.out.println("ohh a working day");
                break;
                case "friday":
                System.out.println("ohh a working day");
                break;
                case "saturday":
                System.out.println("hurrah! a weekend");
                break;
        
            default:
            System.out.println("correct enter week");
                break;
     }
    }
}
