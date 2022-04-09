
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        String response = "Not found.";
        
        try(Scanner theFile = new Scanner(Paths.get(file))){
            while(theFile.hasNextLine()){
                String row = theFile.nextLine();
                if(row.contains(searchedFor)){
                    response = "Found!";
                }
                    
            
            }
            System.out.println(response);
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
