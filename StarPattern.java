import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines you want: ");
        int n = sc.nextInt();

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            // for new line otherwise all pattern is going to print on one linw
        }
    }

}
