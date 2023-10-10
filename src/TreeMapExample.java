import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruitMap = new TreeMap<>();
        fruitMap.put("Apple", 23);
        fruitMap.put("Orange", 23);
        fruitMap.put("Banana", 21);
        fruitMap.put("CustardApple", 21);
        //it will sort the map based on key internally implements Binary Search tree
        System.out.println(fruitMap);
        System.out.println();
        /*
   Iterate over the entries in the TreeMap using an Iterator.

   An Iterator is used to traverse the key-value pairs (Map.Entry) in the TreeMap.
   For each entry, the fruit name and its quantity are printed to the console.

   Note: The use of a TreeMap ensures that the entries are iterated in ascending order based on the fruit names.
*/
        Iterator<Map.Entry<String, Integer>> iterator = fruitMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("fruit:" + entry.getKey() + " quantity:" + entry.getValue());
        }


    }
}
