
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

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        int longest = 0;
        String element= null;
        if(!(this.elements == null)){
            for (String letters : elements){
                if (letters.length() > longest){
                    longest = letters.length();
                    element = letters;
                }
                
            }
            return element;
        }
        return element;
    }

}
