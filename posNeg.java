import java.util.Scanner;

public class posNeg {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        if (n >= 0) {

            System.out.println(n + " is a Positive Number");
        } else {
            System.out.println(n + " is a Negative Number");
        }

    }
}
