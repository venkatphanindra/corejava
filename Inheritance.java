// Superclass
class Animal {
    // Method in superclass
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Method in subclass
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of subclass Dog
        Dog dog = new Dog();
        
        // Calling methods from superclass and subclass
        dog.eat();  // Output: Animal is eating...
        dog.bark(); // Output: Dog is barking...
    }
}