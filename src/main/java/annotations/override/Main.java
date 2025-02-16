package annotations.override;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Calls overridden method
    }
}