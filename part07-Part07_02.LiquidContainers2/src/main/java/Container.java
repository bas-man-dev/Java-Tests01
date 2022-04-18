/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class Container {
    private final int MAXVOLUME = 100;
    private int total;
    
    public Container(){
        this.total = 0;
        
    }
    public int contains(){
        return this.total;
    }
    
    public void add(int amount){
        if(amount > 0){
            if(this.total + amount > 100){
                this.total = 100;
            } else {
                this.total+=amount;
            }
        }
    }
    
    public void remove(int amount){
        if(amount > 0){
            if(this.total - amount < 0){
                this.total = 0;
            } else {
                this.total-=amount;
            }
        }
    }
    
    public String toString(){
        return this.total + "/100";
    }
    
    
}
