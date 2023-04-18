public class UnaryOperators {
    public static void main(String args[]) {

        // Unary Operators

        int a = 5;
        int b = ++a; // pre- increment

        // a = 11 then a increased bye 1 stored a = 11 stored and b = 11; value change
        // hogi fir use hogi
        System.out.println(a);
        System.out.println(b);

        int c = 6;
        int d = c++; // post increment

        // c = 6 (Stored) then d = 6 then c is increased by 1 c = 7 stored and then d =
        // 6; value use hogi fir chnage hogi
        System.out.println(c);
        System.out.println(d);

        int e = 5;
        int f = --e; // pre- increment

        // e = 5 then e decrease by 1 then e = 4 stored and f = 4; value change hogi fir
        // use hogi
        System.out.println(e);
        System.out.println(f);

        int g = 6;
        int h = g--; // post increment

        // g = 6 (stored) then h = 6 then g is decrease by 1 g = 5 stored and h = 6 ;
        // value use hogi fir chnage hogi
        System.out.println(g);
        System.out.println(h);

    }

}
