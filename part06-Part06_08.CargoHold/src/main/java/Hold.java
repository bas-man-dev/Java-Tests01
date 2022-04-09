
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
public class Hold {
    private ArrayList<Suitcase> bags;
    private int maxWeight;
    private int currentWeight;
    
    public Hold(int maxWeight){
        this.bags = new ArrayList<>();
        this.maxWeight=maxWeight;
        this.currentWeight=0;
        
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.currentWeight + suitcase.totalWeight()<= this.maxWeight){
            this.bags.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }

    }
    
    public String toString(){
        return this.bags.size() + " suitcases (" + this.currentWeight + " kg)";
    }
    
    public void printItems(){
        if(this.bags.isEmpty()){
            System.out.println("Hold is empty");
        }
        
        for (Suitcase bag : this.bags){
            
            while(bag.totalWeight()>0){
                System.out.println(bag.takeItem());
            }
            
        }
        
    }
}
