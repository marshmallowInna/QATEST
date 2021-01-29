package annotation;

import anotation2.Main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Save {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Main.TextContainer txt = new Main.TextContainer();
        Class<?> cls = txt.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(doSave.class)) {
                doSave an = method.getAnnotation(doSave.class);
                method.invoke(txt);
            }
        }
    }
}
