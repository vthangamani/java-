// Parent Class
class Animal {

    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void eat(String food) {
        System.out.println("Animal is eating " + food);
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // Method Overriding
        dog.sound();

        // Method Overloading
        dog.eat();
        dog.eat("Bones");
    }
}
