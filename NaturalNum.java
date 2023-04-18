import java.util.Scanner;

public class NaturalNum {

    // sum of n natural numbers
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        // counter or iterator. we have to initialize the iterator with value otherwise
        // it gives ERROR

        while (i <= n) {
            // we dont have to print the n now we have to add it in the sum so..

            sum = sum + i; // or you can write it as sum += i;
            i++;
        }
        System.out.print("Sum of " + n + " Natural numbers is " + sum);
    }

}
