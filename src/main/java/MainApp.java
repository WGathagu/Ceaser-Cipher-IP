import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Option 1, 2 or 3:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Quit");
        String option = scanner.nextLine();

        if(option.equals("1")){
            System.out.println("Enter text to encrypt:");
            String input = scanner.nextLine();
            System.out.println("___________________________");

            System.out.println("Enter a key for the encryption:");
            int key = scanner.nextInt();
            System.out.println("___________________________");
            Encrypt cipher = new Encrypt(input,key);
            String encrypted = Encrypt.encrypt(cipher);
            System.out.println("Encrypted message: " + encrypted);


        } else if (option.equals("2")) {
            System.out.println("Enter text to decrypt:");
            String input = scanner.nextLine();
            System.out.println("___________________________");

            System.out.println("Enter the key for the decryption:");
            int key = scanner.nextInt();
            System.out.println("___________________________");
            Decrypt ceaser = new Decrypt(input,key);
            String decrypted = Decrypt.decrypt(ceaser);

            System.out.println("Decrypted message: " + decrypted);


        } else if (option.equals("3")) {
            System.out.println("Exiting...");
        }
    }
}
