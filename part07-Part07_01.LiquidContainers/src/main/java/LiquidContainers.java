
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.print("First: " + container1 + "/100\n"+
                    "Second: " + container2 +"/100\n");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }
            if (parts[0].equals("add")){
                //System.out.println("adding " + parts[1]);
                int amount = Integer.valueOf(parts[1]);
                if (amount < 0){
                    continue;
                }
                if(container1+amount > 100){
                    container1 = 100;
                } else {
                    container1+=amount;
                }
                
            }
            if (parts[0].equals("move")){
                int transfer = Integer.valueOf(parts[1]);
                if (transfer<0){
                continue;
            }
                if(container1 - transfer < 0){
                    container2 += container1;
                    container1 = 0;
                } else if(container2 + transfer >100){
                    container2 = 100;
                } else {
                    container2+=transfer;
                    container1-=transfer;
                }
            }
            
            if(parts[0].equals("remove")){
                int remove = Integer.valueOf(parts[1]);
                if (container2 - remove < 0){
                    container2 = 0;
                } else {
                    container2-=remove;
                }
            }
            

        }
        
        
    }

}
