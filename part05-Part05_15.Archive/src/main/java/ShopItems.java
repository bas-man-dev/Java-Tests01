/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class ShopItems {
    private String idNumber;
    private String name;
    
    public ShopItems(String idNumber, String name){
        this.idNumber=idNumber;
        this.name=name;
    }
    
    public String toString(){
        return this.idNumber + ": " + this.name; 
    }
    
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }
        
         // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof ShopItems)) {
            return false;
        }
        
        ShopItems comparedShopItems = (ShopItems) compared;
        
        // if the values of the object variables are equal, the objects are, too
        return this.idNumber.equals(comparedShopItems.idNumber);
        
    }
    
    public String getIdNumber() {
        return this.idNumber;
    }

    public String getName() {
        return this.name;
    }

}
