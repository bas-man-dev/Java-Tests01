
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return !(this.people.size() > 0);
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        Person shortestPerson = null;
        int shortest = 1000;
        
        if(!(this.people.isEmpty())){
            for (Person shorty : this.people){
                if (shorty.getHeight() < shortest){
                    shortest = shorty.getHeight();
                    shortestPerson = shorty;
                
            }
            
        }
            return shortestPerson;
        }
       
        
        
        return shortestPerson;
    }
    
    public Person take(){
        Person shortestPerson = null;
        int shortest = 1000;
        
        if(!(this.people.isEmpty())){
            for (Person shorty : this.people){
                if (shorty.getHeight() < shortest){
                    shortest = shorty.getHeight();
                    shortestPerson = shorty;
                
            }
            
        }
            this.people.remove(shortestPerson);
            return shortestPerson;
        }
       
        
        
        return shortestPerson;
    }
}
    
