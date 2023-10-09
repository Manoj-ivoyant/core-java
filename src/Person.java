import java.io.Serializable;

// The Person class implements the Serializable interface, making it serializable.
public class Person implements Serializable {
    private String aadhar;   // Aadhar number of the person
    private String name;     // Name of the person
    private Integer age;     // Age of the person
    private String gender;   // Gender of the person

    // Default constructor
    public Person() {
    }

    // Parameterized constructor to initialize the Person object.
    public Person(String aadhar, String name, Integer age, String gender) {
        super();
        this.aadhar = aadhar;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter method for retrieving Aadhar number.
    public String getAadhar() {
        return aadhar;
    }

    // Getter method for retrieving the name.
    public String getName() {
        return name;
    }

    // Getter method for retrieving the age.
    public Integer getAge() {
        return age;
    }

    // Getter method for retrieving the gender.
    public String getGender() {
        return gender;
    }
}
