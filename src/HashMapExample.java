import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //collection stores based on key-value pair also keys are unique
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(23, "Manoj");
        hashMap.put(29, "Vinay");
        hashMap.put(28, "punith");
        hashMap.put(28, "rahul");
        System.out.println(hashMap);
        //it will return associated value of key specified
        System.out.println(hashMap.get(28));
        //add to map if no value for a specified
        hashMap.computeIfAbsent(30, k -> "Kohli");
        System.out.println(hashMap);
        System.out.println();
        //converts keys of hashmap to list
        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet);

        /*
   Iterate over the entries in the HashMap using an Iterator.

   An Iterator is used to traverse the key-value pairs (Map.Entry) in the HashMap.
   For each entry, the age and name are printed to the console.

   Note: The use of Iterator allows us to iterate over the entries in a controlled manner.
     */

        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("age:" + entry.getKey() + " Name:" + entry.getValue());
        }
    }
}
