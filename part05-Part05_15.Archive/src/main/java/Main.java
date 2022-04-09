
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ShopItems> shopItems = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            
            
            ShopItems items = new ShopItems(identifier, name);
            if(!(shopItems.contains(items))){
                shopItems.add(items);
            }
            
            
        }
        System.out.println("==Items==");
        for (ShopItems item : shopItems){
            System.out.println(item);
        }
        



    }
}
