package reflecetions.retrieveannotation;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflecetions.retrieveannotation.AnnotatedClass");


            if (clazz.isAnnotationPresent(Author.class)) {
                Annotation annotation = clazz.getAnnotation(Author.class);
                Author author = (Author) annotation;
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
