
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class JokeManager {
    private ArrayList<String> jokeBook;
    
    public JokeManager(){
        this.jokeBook = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokeBook.add(joke);
    }
    
    public String drawJoke(){
        Random r = new Random();
        if(!(this.jokeBook.isEmpty())){
            System.out.println("Drawing Joke:");
            int x = r.nextInt(this.jokeBook.size());
            return this.jokeBook.get(x);
        }
        
        
        
        return "Jokes are in short supply.";
    }
    
    
    public void printJokes(){
        if(!(this.jokeBook.isEmpty())){
            System.out.println("Printing the jokes.");
            for(String joke : this.jokeBook){
                System.out.println(joke);
            }
        } else {
            System.out.println("Jokes are in short supply.");
        }
        
    }
}
