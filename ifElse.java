import java.util.*;

public class ifElse {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println(" Your Age:" + age);

        if (age >= 18) {

            System.out.println("Adult: Vote,Drive");
        }
        if (age >= 13 && age < 18) {

            System.out.println("Teenager");
        } else {
            System.out.println("NOT Adult");
        }
    }
}
