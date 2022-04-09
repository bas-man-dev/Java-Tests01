
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = "";
        
        while(true){
            String data = scanner.nextLine();
            if (data.length()<1){
                break;
            }
            String[] dd = data.split(",");
            int age = Integer.valueOf(dd[1]);
            if(age>oldest){
                oldest = age;
                name = dd[0];
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
