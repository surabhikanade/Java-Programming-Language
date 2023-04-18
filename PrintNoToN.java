import java.util.Scanner;

public class PrintNoToN {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of number: ");
        int n = sc.nextInt();

        int counter = 1;

        while (counter <= n) {

            System.out.print(counter + " ");
            counter++;

        }
        System.out.println();
    }
}