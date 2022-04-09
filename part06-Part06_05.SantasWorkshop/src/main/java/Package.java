
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
public class Package {
    private ArrayList<Gift> gifts;
    
    
    public Package(int maxWeight){
        this.gifts = new ArrayList<>();
        
        
    }
    public void addGift(Gift gift){
        if(!(gift.getName().isEmpty() || gift.getWeight() < 0)){
            this.gifts.add(gift);
        }
        
    }
    public int totalWeight(){
        int weight = 0;
        if (gifts.size()<=0){
            return -1;
        }
        for (Gift gift : gifts){
            weight += gift.getWeight();
        }
        return weight;
    }
}
