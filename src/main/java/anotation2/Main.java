package anotation2;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.awt.SystemColor.TEXT;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException {
        TextContainer container = new TextContainer();
        Class<?> cls = container.getClass();

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                method.invoke(container, saveTo.path());
            }
        }
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @interface SaveTo {

        String path();
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @interface Saver {

    }

    @SaveTo(path = "c:\\file.txt")
    public static class TextContainer {

        private static final String TEXT = "Text bla bla bla";

        @Saver
        public static void save(String path) {
            try (FileWriter writer = new FileWriter(path)) {
                writer.write(TEXT);
                System.out.println("Saving: DONE");
            } catch (IOException ex) {
                System.out.println("Saving: ERROR - " + ex.getMessage());
            }
        }
    }

}