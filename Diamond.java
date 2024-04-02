abstract class Animal {
    abstract void eat();
}

abstract class Mammal extends Animal {
    void eat() {
        System.out.println("Mammal is eating");
    }
}

abstract class Bird extends Animal {
    void eat() {
        System.out.println("Bird is eating");
    }
}

// DiamondProblem class inherits from both Mammal and Bird classes
class DiamondProblem extends Mammal {
    // Resolving the conflict by providing a specific implementation
    void eat() {
        System.out.println("DiamondProblem is eating");
    }
}

public class Diamond {
    public static void main(String[] args) {
        // Create an instance of DiamondProblem class
        DiamondProblem diamondProblem = new DiamondProblem();

        // Call the eat() method
        diamondProblem.eat(); // Output will be "DiamondProblem is eating"
    }
}