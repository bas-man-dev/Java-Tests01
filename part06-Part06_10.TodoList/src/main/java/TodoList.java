   
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
public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        for (int i = 1; i <=this.tasks.size();i++){
            System.out.println(i + ": " + this.tasks.get(i-1));
        }
    }
    
    public void remove(int number){
        this.tasks.remove(number-1);
    }
    
    public ArrayList getTodoList(){
        return this.tasks;
    }
    
}

