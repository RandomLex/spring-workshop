package by.academy.spring.model;

import by.academy.spring.qualifiers.CustomQualifierWithEnum;
import by.academy.spring.qualifiers.CustomQualifierWithString;
import by.academy.spring.qualifiers.MentorQualifier;
import by.academy.spring.qualifiers.TeacherQualifier;
import by.academy.spring.qualifiers.TeacherType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group implements Printable {
    private int id;
    private String name;
    @Autowired(required = true)
    @Qualifier("anton")
    private Teacher teacher;
    private List<Student> students;

    public Group(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    @Override
    public void print(String str) {
        System.out.println(toString());
    }

    public void create() {
        System.out.println("Init method " + name + " is run");
    }

    public void finish() {
        System.out.println("Destroy method " + name + " is run");
    }


}
