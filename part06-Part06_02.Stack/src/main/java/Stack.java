/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author owner
 */
public class Stack {
    private ArrayList<String> values;
    
    public Stack(){
        this.values=new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        String value = new String(this.values.get(this.values.size() - 1));
        this.values.remove(value);
        return value;
        
    }
}
