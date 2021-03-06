package by.academy.spring.config;


import by.academy.spring.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;


@PropertySource("classpath:students.properties")
public class StudentConfig {

    @Value("${john.id}")
    private int johnId;
    @Value("${john.name}")
    private String johnName;
    @Value("#{${john.marks}}")
    private Map<String, Integer> johnMarks;

    @Bean
    public Student john() {
        Student student = new Student(johnId, johnName);
        student.setMarks(johnMarks);
        return student;
    }

    @Bean
    public Student bob() {
        Student student = new Student(1, "John");
        student.setMarks(Map.of("Java", 7, "Python", 8, "C", 9));
        return student;
    }

}
