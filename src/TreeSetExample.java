import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Treeset does not allow dupicates and also sorts by default
        TreeSet<String> students = new TreeSet<>();
        students.add("Abhishek");
        students.add("Abdul");
        students.add("Manoj");
        students.add("Denial");
        students.add("Manoj");
        System.out.println(students);
        //to get the first element of the treeset
        System.out.println(students.first());
        //to get the last element of the treeset
        System.out.println(students.last());

        //to get a elements of treeset upto/from specified element
        System.out.println(students.headSet("Denial"));
        System.out.println(students.tailSet("Abhishek"));
    }
}
