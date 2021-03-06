package by.academy.spring.config;


import by.academy.spring.model.Group;
import by.academy.spring.model.Student;
import by.academy.spring.model.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;


@PropertySource({"classpath:students.properties", "classpath:teachers.properties"})
public class JavaBasedConfig {

    @Value("${john.id}")
    private int johnId;
    @Value("${john.name}")
    private String johnName;
    @Value("#{${john.marks}}")
    private Map<String, Integer> johnMarks;

    @Value("${alex.certificates}")
    private List<String> alexCertificates;

    @Bean
    public Group ee() {
        Group group = new Group(1, "EE" , null);
        group.setStudents(List.of(john(), bob()));
        group.setTeacher(anton());
        return group;
    }

    @Bean
    public Teacher alex() {
        Teacher teacher = new Teacher(77, "Alex", 100);
        teacher.setCertificates(alexCertificates);
        return teacher;
    }

    @Bean
    public Teacher anton() {
        Teacher teacher = new Teacher(99, "Anton", 100);
        teacher.setCertificates(List.of("Java", "Spring"));
        return teacher;
    }

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
