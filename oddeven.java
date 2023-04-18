import java.util.*;

public class oddeven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Number:" + n);

        if (n % 2 == 0) {

            System.out.println(n + " is the Even Number");

        } else {

            System.out.println(n + " is the Odd Number");
        }

    }

}
