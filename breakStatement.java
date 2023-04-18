public class breakStatement {
    public static void main(String args[]) {

        // we use break statement to exit the loop;
        // we used in switch statement

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("I am out of the loop");
    }
}