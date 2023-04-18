public class LogicalOperators {
    public static void main(String args[]) {

        System.out.println("&& -> Logical AND Opeartor");
        // Logical Operator

        // && Oerator

        // statment 1 && statement 2 | Ans
        // T | T | True
        // T | F | False
        // F | T | False
        // F | F | False

        int A = 10;
        int B = 5;

        // T && T
        System.out.println((A > B) && (B == 5));

        // T && F
        System.out.println((A < B) && (A == B));

        // F && T
        System.out.println((A <= B) && (A > B));

        // F && T
        System.out.println((A >= B) && (A <= B));

        System.out.println(" || -> Logical OR Opeartor");
        // || Logical OR Operator

        // statment 1 || statement 2 | Ans
        // T | T | True
        // T | F | True
        // F | T | True
        // F | F | False

        int C = 10;
        int D = 5;

        // T || T
        System.out.println((C > D) || (D < C));

        // T || F
        System.out.println((C > D) || (C == D));

        // F || T
        System.out.println((C == D) || (C > D));

        // F || F
        System.out.println((C == D) || (C <= D));

        System.out.println("! ->  Logical NOT Opeartor");
        // ! Logical Not operator

        // statment ! Ans
        // T | F
        // F | T

        int E = 9;
        int F = 7;

        // E > F is true but because of ! it will be false.
        System.out.println(!(E > F));

        // E < F is false but because of ! it will be true.
        System.out.println(!(E < F));

    }

}
