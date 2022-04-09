
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        String message = "Cannot calculate the average";
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            
            sum+= num;
            count++;
            
            
        }
        if (sum == 0 || count == 0) {
            System.out.println(message);
        } else {
            System.out.println((double)(1.0*sum/count));
        }

    }
}
