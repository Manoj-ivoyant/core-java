import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        //type of collection here is safe type and use generic like Integer, String, Double, Long
        //implements linked list feature like keeping the adress of previous and next members
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println(evenNumbers);
        //prints last element of linked list
        System.out.println(evenNumbers.peekLast());
        System.out.println();
        //we can create iterator of linked list type which will helpful for traversing backword too
        ListIterator<Integer> i = evenNumbers.listIterator(evenNumbers.size());

        //hasPrevious of ListIterator validates the loop from backwards and return true if contains previous element
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }
    }
}
