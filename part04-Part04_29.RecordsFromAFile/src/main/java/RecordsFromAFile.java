
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner theFile = new Scanner(Paths.get(file))){
            
            while(theFile.hasNextLine()){
                String line = theFile.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String[] parts = line.split(",");
                int age = Integer.valueOf(parts[1]);
                if (age == 1){
                    System.out.println(parts[0] +", age: " + parts[1] + " year");
                    continue;
                }
                System.out.println(parts[0] +", age: " + parts[1] + " years");
            }
            
        } catch(Exception e){
            System.out.println("File: " +e.getMessage());
        }
    }
}
