package reflecetions.retrieveannotation;

import org.junit.jupiter.api.Test;
import java.lang.annotation.Annotation;
import static org.junit.jupiter.api.Assertions.*;

class AnnotationRetrieverTest {

    @Test
    void testAnnotationRetrieval() throws Exception {
        Class<?> clazz = AnnotatedClass.class;

        // Check if @Author annotation is present
        assertTrue(clazz.isAnnotationPresent(Author.class));

        // Retrieve and check annotation details
        Annotation annotation = clazz.getAnnotation(Author.class);
        assertNotNull(annotation);

        Author author = (Author) annotation;
        assertEquals("John Doe", author.name());
    }
}

// Sample annotated class for testing
@Author(name = "John Doe")
class AnnotatedClass {}