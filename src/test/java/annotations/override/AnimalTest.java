package annotations.override;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AnimalTest {

    @Test
    void testAnimalMakeSound() {
        Animal animal = new Animal();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animal.makeSound();

        assertEquals("Animal makes a sound" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testDogMakeSound() {
        Animal dog = new Dog();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.makeSound();

        assertEquals("Dog barks" + System.lineSeparator(), outContent.toString());
    }
}
