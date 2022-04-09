
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigName = "";
        int letters = 0;
        int sumOfYears = 0;
        int count = 0;

        while(true){
            String data = scanner.nextLine();
            if(data.length()<1){
                break;
            }
            String[] dd = data.split(",");
            int year = Integer.valueOf(dd[1]);
            String name = dd[0];
            if (name.length() > letters){
                letters = name.length();
                bigName = name;
                
            }
            sumOfYears+=year;
            count++;
        }
        System.out.println("Longest name: " + bigName);
        System.out.println("Average of the birth years: " + (double) 1.0*sumOfYears/count);

    }
}
