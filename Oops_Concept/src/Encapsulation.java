
public class Encapsulation {

    public static void main(String[] args) {
        // Create an instance of the Mydemo class and call its main method
        Mydemo.main(args);
    }
}

// Encapsulated Person class
class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;
 
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public int getAge() { return age; }
 
    public void setAge(int age) { this.age = age; }
}

// Driver Class
class Mydemo {
    // main function
    public static void main(String[] args) {
        // person object created
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
 
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}