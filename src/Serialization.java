import java.io.*;

/**
 * This class demonstrates serialization and deserialization in Java.
 * It serializes a 'Person' object to a file and then deserializes it
 * to retrieve and display the object's information.
 */
public class Serialization {
    public static void main(String[] args) {

        try {
            // Serialization
            FileOutputStream fp = new FileOutputStream("C:\\Users\\user\\Documents\\person.txt");
            ObjectOutputStream out = new ObjectOutputStream(fp);
            out.writeObject(new Person("587164123035", "Manoj", 23, "male"));
            fp.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Deserialization
            FileInputStream fp = new FileInputStream("C:\\Users\\user\\Documents\\person.txt");
            ObjectInputStream in = new ObjectInputStream(fp);
            Person b = (Person) in.readObject();
            System.out.println(" Aadhaar: " + b.getAadhar() + "\n name: " + b.getName() + "\n age: " + b.getAge() + "\n gender: " + b.getGender());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
