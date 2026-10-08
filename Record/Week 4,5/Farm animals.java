package recordprograms;

// Farm Animals Java Application
class Animal {
    // Data members
    String name;
    String place;
    String food;
    String sound;

    // Default constructor
    Animal() {
        name = "Unknown";
        place = "Farm";
        food = "Unknown";
        sound = "Unknown";
    }

    // Parameterized constructor
    Animal(String name, String place, String food, String sound) {
        this.name = name;
        this.place = place;
        this.food = food;
        this.sound = sound;
    }

    // Method to display animal details
    void displayDetails() {
        System.out.println("Animal    : " + name);
        System.out.println("Stays     : " + place);
        System.out.println("Eats      : " + food);
        System.out.println("Sound     : " + sound);
        System.out.println();
    }

    // Method with parameter passing
    void makeSound(String sound) {
        System.out.println(name + " makes sound: " + sound);
    }

    // Overloaded method
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Overloaded method with parameter
    void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }
}

public class FarmAnimals {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Animal cow = new Animal("Cow", "Cowshed", "Grass", "Moo");
        Animal pig = new Animal("Pig", "Pigsty", "Grains", "Oink");
        Animal horse = new Animal("Horse", "Stable", "Hay", "Neigh");

        // Display details
        System.out.println("===== FARM ANIMALS =====");
        cow.displayDetails();
        pig.displayDetails();
        horse.displayDetails();

        // Parameter passing
        System.out.println("===== ANIMAL SOUNDS =====");
        cow.makeSound("Moo");
        pig.makeSound("Oink");
        horse.makeSound("Neigh");

        // Method overloading
        System.out.println("\n===== EATING =====");
        cow.eat();
        pig.eat("Grains");
        horse.eat("Hay");

        // Creating object using default constructor
        Animal animal = new Animal();
        System.out.println("\n===== DEFAULT CONSTRUCTOR =====");
        animal.displayDetails();
    }
}
