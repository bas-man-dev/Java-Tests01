
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        
            return this.translations.get(word);
    }
        
    
    
    public String wordTranslation(String word){
        if(!(this.translations.containsKey(word))){
            return "Word " + word + " was not found";
        }
        return "Translation: " + this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
