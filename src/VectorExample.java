import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        //this collection(legacy version) has special feature like thread safe and provides backword compatibilty
        Vector<Double> discounts = new Vector<Double>();
        discounts.add(23.3);
        discounts.add(12.4);
        discounts.add(32.3);
        //returns boolean status whether element present in vector or not
        System.out.println(discounts.contains(23.3));
        System.out.println();
        System.out.println(discounts);
        System.out.println();
        //return the index of element specified
        System.out.println(discounts.indexOf(12.4));
        //we can use the iterator to traverse the vector also we can use the ListIterator to traverse the vector in both forword n bacword
        ListIterator iterator = discounts.listIterator(discounts.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
        //we can use Enumeration(legacy v.1) for traversing vector
        Enumeration enumeration = discounts.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }


    }
}
