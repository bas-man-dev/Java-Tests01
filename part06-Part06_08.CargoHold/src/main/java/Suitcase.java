
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight=maxWeight;
        this.currentWeight=0;
    }
    
    public void addItem(Item item){
        int projectedWeight = this.currentWeight + item.getWeight();
        // Check that item will not exceed max weight
        if(!(item.getName().isEmpty())){
            if(projectedWeight <= this.maxWeight){
                this.items.add(item);
                this.currentWeight += item.getWeight();
            }
        }
    }
    
    public String toString(){
        if (this.items.size() == 1){
            return "1 item (" + items.get(0).getWeight() +" kg)";
        } else if(this.items.size() > 1){
            return this.items.size() + " items (" + this.currentWeight + " kg)";
        } else {
            return "no items (" + this.currentWeight + " kg)";
        }
        
        
    }
    public void printItems(){
        for (Item item : this.items){
            System.out.println(item);
        }
        
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for (Item item : items){
            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    public Item takeItem(){
        /*if(this.items.isEmpty()){
            return null;
        }*/
        Item item = this.items.get(0);
        
        for (Item it : this.items){
            if(it.getWeight()>item.getWeight()){
                item = it;
            }
        }
        this.items.remove(item);
        this.currentWeight-=item.getWeight();
        return item;
    }

    
}
