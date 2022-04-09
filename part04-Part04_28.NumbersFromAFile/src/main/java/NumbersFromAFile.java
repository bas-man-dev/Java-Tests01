
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner theFile = new Scanner(Paths.get(file))){
            int count = 0;
            while(theFile.hasNextLine()){
                //String row = theFile.nextLine();
                int num = Integer.valueOf(theFile.nextLine());
                if (num >= lowerBound && num <= upperBound){
                    count++; 
                }
                
                    
            
            }
            System.out.println("Numbers: " + count);
            
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }   
       
    }

}
