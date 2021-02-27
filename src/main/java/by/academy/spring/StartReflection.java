package by.academy.spring;

import by.academy.spring.model.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StartReflection {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor(int.class, String.class);
        Student student = constructor.newInstance(42, "SomeName");
        System.out.println(student);

        Method setId = studentClass.getMethod("setId", int.class);
        setId.invoke(student, 99);
        System.out.println(student);

        Method setMarks = studentClass.getMethod("setMarks", Map.class);
        setMarks.invoke(student, Map.of("Java", 10));
        System.out.println(student);


        System.out.println("Fields");
        Arrays.stream(studentClass.getDeclaredFields()).forEach(printDeclaredFields(student));

        System.out.println("Parent fields");
        Arrays.stream(studentClass.getSuperclass().getDeclaredFields()).forEach(printDeclaredFields(student));
    }

    private static Consumer<Field> printDeclaredFields(Student student) {
        return field -> {
            field.setAccessible(true);
            try {
                System.out.println(field.get(student));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        };
    }
}
