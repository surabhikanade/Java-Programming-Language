import java.util.Scanner;

public class PrimeNo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n == 2) {
            System.out.println(" 2 is prime Number");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i (i not equal to 1or n )
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is Prime No.");
            } else {
                System.out.println(n + " is Not prime Number.");
            }

        }

    }

}
