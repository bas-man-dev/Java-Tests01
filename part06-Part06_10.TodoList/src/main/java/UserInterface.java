
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;
    
    public UserInterface(TodoList tasks, Scanner scanner){
        this.scanner = scanner;
        this.tasks = tasks;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("end") || command.equals("stop")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                
            
                this.tasks.add(task);
                continue;
            }
            if(command.equals("list")){
                this.tasks.print();
                continue;
            }
            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removeThis = Integer.valueOf(this.scanner.nextLine());
                this.tasks.remove(removeThis);
                continue;
            }
            
            System.out.println("Unknown command");
        }
    
   

    }
    
    
}
