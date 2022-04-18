
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        


        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            
            if(parts[0].equals("quit")) {
                break;
            }
            
                       
            if(parts[0].equals("add")){
                int number = Integer.valueOf(parts[1]);
                container1.add(number);
                
            }
            if(parts[0].equals("remove")){
                int number = Integer.valueOf(parts[1]);
                container2.remove(number);
                
            }
            if(parts[0].equals("move")){
                int number = Integer.valueOf(parts[1]);
                int first = container1.contains();
                container1.remove(number);
                if(number > first){
                    container2.add(first);
                }else{
                    container2.add(number);
                }
                
                
            }
            
            
            
            
            

        }
    }

}
