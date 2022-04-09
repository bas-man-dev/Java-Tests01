
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a string: ");
            String tr = scanner.nextLine();
            if (tr.equals("true")){
                System.out.println("You got it right!");
                break;
            }
            System.out.println("Try again!");
            break;
        }

    }
}
