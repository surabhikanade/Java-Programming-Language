import javafx.scene.input.SwipeEvent;

public class Switch {
    public static void main(String args[]) {

        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Samosa");
                break;
            default:
                System.out.println("NOt yet decided ");

        }
    }

}
