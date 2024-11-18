package HashMaps;
import java.util.HashSet;
import java.util.HashMap;
public class Map {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("Vedant",89);
        // map.put("Nidhi",99);
        // map.put("Kavita",94);

        // System.out.println(map.keySet());

        // HashSet<Integer> set = new HashSet<>();
        // set.add(45);
        // set.add(32);
        // set.add(32);
        // set.add(2);
        // System.out.println(set);

        MapUsingHash map = new MapUsingHash();
        map.put("Mango","King of Fruits");
        map.put("Kavita","She is talented Beautiful");
        System.out.println(map.get("Kavita"));
        System.out.println(map.get("Mango"));
        map.remove("Mango");
        System.out.println(map.get("Mango"));
        


    }
}
class MapUsingHash {
    private Entity[] entities;
    public MapUsingHash() {
        entities = new Entity[100];
    }
    private class Entity {
        String key;
        String value;

        public Entity(String key,String value) {
            this.key = key;
            this.value = value;
        }
        }
         // Create function to put the key in the hash table or map. 
         public void put(String key, String value) {
            int hash = Math.abs(key.hashCode() % entities.length);
            entities[hash] = new Entity(key,value); // this is an overriding hasmap which means if same index comes it will overide the element at that index
        }
        
        // Function to get the Key in constant time 
        public String get(String key) {
            int hash = Math.abs(key.hashCode() % entities.length);
            if(entities[hash]!=null && entities[hash].key == key) {
                return entities[hash].value;
            }
            return null;
        }
        // FUNCTION TO REMOVE THE KEY FROM THE HASH TABLE
        public void remove(String key) {
            int hash = Math.abs(key.hashCode() % entities.length);
            if(entities[hash]!=null && entities[hash].key==key) {
                entities[hash] = null;
            }
    }
}
