
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int num1 = Integer.valueOf(scanner.nextLine());
            if (num1 == 9999){
                break;
            }
            list.add(num1);
        }
        System.out.println("");
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int lowest = 9999;
        for (int i=0;i<list.size();i++){
            if (list.get(i) < lowest){
                lowest = list.get(i);
                
            }
        }
        
        System.out.println("Smallest number: " + lowest);
        for (int i=0;i<list.size();i++){
            if (list.get(i) == lowest){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
