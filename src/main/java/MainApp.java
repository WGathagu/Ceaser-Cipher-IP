import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Option 1, 2 or 3:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Quit");
        String option = scanner.nextLine();

        if(option.equals(1)){
            System.out.println("Enter text to encrypt:");

        } else if (option.equals(2)) {
            System.out.println("Enter text to decrypt:");

        } else if (option.equals(3)) {
            System.out.println("Exiting...");
        }
    }
}
