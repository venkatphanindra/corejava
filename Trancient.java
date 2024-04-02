import java.io.*;

class Employee implements Serializable {
    String name;
    transient double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Trancient {
    public static void main(String[] args) {
        // Create an object
        Employee emp = new Employee("Phanindra", 50000.0);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("Deserialized object:");
            System.out.println("Name: " + deserializedEmp.name);
            System.out.println("Salary: " + deserializedEmp.salary); // Will print 0.0 for transient field
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
