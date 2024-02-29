import java.util.HashMap;

public class HashMapClass {
    manage_inventory inv = new manage_inventory();
    
    public HashMap<String, String> myHashMap; // Declaring the HashMap

    // Constructor to initialize the HashMap
    public HashMapClass() {
        myHashMap = new HashMap<>();
    }

    // Method to add items to the HashMap
    public void addItem(String itemName, String quantity) {
        myHashMap.put(itemName, quantity);
    }

    // Getter method to access the HashMap
    public HashMap<String, String> getMyHashMap() {
        return myHashMap;
    }
}