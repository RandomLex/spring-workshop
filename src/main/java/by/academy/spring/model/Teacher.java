package by.academy.spring.model;

import by.academy.spring.qualifiers.TeacherQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Component
@TeacherQualifier
public class Teacher extends Person {
    private int salary;
    private List<String> certificates;

    public Teacher(int id, String name) {
        super(id, name);
    }

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void print(String str) {
        System.out.println(toString());
    }

}
