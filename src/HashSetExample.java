import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        //provides a hybrid implementation of a hash table and a linked list. It maintains a predictable order of elements while still offering fast retrieval times.
        LinkedHashSet<String> courses = new LinkedHashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Software architecture and design patterns");
        courses.add("Automata theory and compatiblity");
        courses.add("cpp");
        //adding duplicate but set will removes(duplicate elements are not allowed)
        courses.add("Python");
        System.out.println(courses);
        System.out.println();
        //we can use java 8 feature->method reference to print collection using forEach
        courses.forEach(System.out::println);
        System.out.println();
        //removes all the elements in the set
        courses.clear();
        System.out.println(courses);
    }
}
