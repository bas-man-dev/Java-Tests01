
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] users = new String[]{"alex", "emma"};
        String[] pass = new String[]{"sunshine", "haskell"};
        System.out.println("Enter username: ");
        String uName = scanner.nextLine();
        System.out.println("Enter password: ");
        String uPass = scanner.nextLine();
        if (Arrays.asList(users).contains(uName) && Arrays.asList(pass).contains(uPass)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
