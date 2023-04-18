import java.util.Scanner;

public class Weekdays {

    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No.:");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNSDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                break;
        }

    }

}
