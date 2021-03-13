package by.academy.spring.model;

import by.academy.spring.qualifiers.CustomQualifierWithEnum;
import by.academy.spring.qualifiers.CustomQualifierWithString;
import by.academy.spring.qualifiers.MentorQualifier;
import by.academy.spring.qualifiers.TeacherQualifier;
import by.academy.spring.qualifiers.TeacherType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Data
@ToString(exclude = "teachers")
@EqualsAndHashCode(exclude = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Component("ee")
@PropertySource("classpath:group.properties")
public class Group implements Printable {
    @Value("${ee.id}")
    private int id;
    @Value("${ee.name}")
    private String name;
    @Autowired
    @Qualifier("studentsEE")
    private List<Student> students;
    private Teacher teacher;

    private Map<String, Teacher> teachers;
    @Value("${ee.teacher}")
    private String teacherName;

    public Group(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    @Autowired
    public void setTeachers(Map<String, Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public void print(String str) {
        System.out.println(toString());
    }

    @PostConstruct
    public void create() {
        System.out.println("Init method " + name + " is run");
        teacher = teachers.get(teacherName);
    }

    public void finish() {
        System.out.println("Destroy method " + name + " is run");
    }


}
