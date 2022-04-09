
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }
    
    public String getName(){
        return this.name;
    }
   
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String printOutput = "The collection " + this.name +" has " + this.elements.size()
                + " element:";
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        
        String itemsOnList = "";
        if(this.elements.size() == 1){
            for(String element : this.elements){
                itemsOnList += (element + "");
            }
        } else {
            printOutput = "The collection " + this.name +" has " + this.elements.size()
                + " elements:";
            for(String element : this.elements){
                itemsOnList += (element + "\n");   
                }
        
        }
        return printOutput + "\n" + itemsOnList; 
    }
    
}
