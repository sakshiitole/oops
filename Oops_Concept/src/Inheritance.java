
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}

// Driver Class
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of Engineer
        Engineer E1 = new Engineer();
        
        // Print out salary and benefits
        System.out.println("Salary : " + E1.salary);
        System.out.println("Benefits : " + E1.benefits);
    }
}