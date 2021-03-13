package by.academy.spring.config;


import by.academy.spring.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Configuration
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

    @Bean
    public List<Student> studentsEE() {
        List<Student> students = new ArrayList<>();
        students.add(john());
        students.add(bob());
        return students;
    }

}
