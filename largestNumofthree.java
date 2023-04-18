import java.util.Scanner;

public class largestNumofthree {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        System.out.println("A" + A);

        int B = sc.nextInt();
        System.out.println("B" + B);

        int C = sc.nextInt();
        System.out.println("C" + C);

        if ((A >= B) && (A >= C)) {

            System.out.println("A:Largest among three numbers.");

        } else if (B >= C) {

            System.out.println("B:Largest among three numbers.");

        } else {

            System.out.println("C:Largest among three numbers.");

        }
    }
}