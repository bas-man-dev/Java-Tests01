
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true){
            String data = scanner.nextLine();
            if (data.length()<1){
                break;
            }
            String[] dd = data.split(",");
            int age = Integer.valueOf(dd[1]);
            
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);


    }
}
