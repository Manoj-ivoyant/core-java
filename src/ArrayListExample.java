import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        //ordered collection follows indexing feature, dynamic array size automatically casts
        ArrayList<String> names = new ArrayList<>();
        names.add("Manoj");
        names.add("sachin");
        names.add("virat");
        System.out.println(names);
        System.out.println();
        //we can get the particular element of collection using index
        System.out.println(names.get(0));
        System.out.println();
        //we can remove the element by specifying index as here it removes value associated with
        System.out.println(names.remove(1));
        System.out.println();
        //after removing the element the list becomes we can use remove all to emtpy the list
        System.out.println(names);
        System.out.println();
        //we can get the size of arrayList by using list.size() method
        System.out.println(String.format("arrayList:names contains %d elements", names.size()));
        System.out.println();
        //we can travese arrayList using Iterator of list type
        Iterator i = names.iterator();

        //we can use the iterator of type to traverse the collection
        //it supports hasNext() which checks whether collection contains next element in it
        while (i.hasNext()) {
            //next() method of Iterator returns the coressponding next element of collection
            System.out.println(i.next());
        }
        System.out.println();
        //we can also use the for each loop to traverse over list
        for (String name : names) {
            System.out.println(name);
        }

    }
}
