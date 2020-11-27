import java.util.Scanner;

public enum InputManager {
    ME;

    private InputManager() {
    }

    public static String loadInput() {
        System.out.println("zmenit jazyk?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
