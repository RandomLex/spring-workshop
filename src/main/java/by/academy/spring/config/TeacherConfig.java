package by.academy.spring.config;


import by.academy.spring.model.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.List;


@PropertySource("classpath:teachers.properties")
public class TeacherConfig {

    @Value("${alex.certificates}")
    private List<String> alexCertificates;

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

}
