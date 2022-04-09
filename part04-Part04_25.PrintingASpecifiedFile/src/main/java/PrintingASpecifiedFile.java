
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed? ");
        String fileToPrint = scanner.nextLine();
        try(Scanner file1 = new Scanner(Paths.get(fileToPrint))){
            while(file1.hasNextLine()){
                String row = file1.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error:" + e);
        }

    }
}
