
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String line = scanner.nextLine();
            if (line.length() < 1){
                break;
            }
            String[] words = line.split(" ");
            System.out.println(words[0]);
        }
    }
}