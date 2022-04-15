
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
    private JokeManager jokeBook;
    
    public UserInterface(JokeManager jokeBook, Scanner scanner){
        this.jokeBook = jokeBook;
        this.scanner = scanner;
    }
    
    public void start(){// TODO
        System.out.println("");
        int x = 0;
        while(x>=0){
            
            String command = getCommand();
            switch(command){
                case "X":
                    // Stop the program
                    x = -1;
                    break;
                case "1":
                    // Add joke
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    this.jokeBook.addJoke(joke);
                    break;
                case"2":
                    // Random joke
                    System.out.println(this.jokeBook.drawJoke());
                    break;
                case"3":
                    // List jokes
                    this.jokeBook.printJokes();
                    break;
                default:
                    break;
                }
            
        }
        

                
                    
    }
    
    public String getCommand(){
        String options = "xX123";
        String command = null;
        while(true){
             System.out.println("Commands:\n"
            + "1 - Add a joke\n" + "2 - Draw a joke\n" + "3 - List jokes\n"
            + "X - stop");
        command = this.scanner.nextLine();
        if(options.contains(command)){
            return command;
        }
        }
       
 
        
    }
    
    /*public void addJoke(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeBook.addJoke(joke);
    }
    
    public void drawJoke(){
        
    }*/
    
    
}
