package by.academy.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {
    private Map<String, Integer> marks;

    public Student(int id, String name) {
        super(id, name);
    }
//
//    public Student(int id, String name, List<Integer> marks) {
//        super(id, name);
//        this.marks = marks;
//    }

    @Override
    public void print(String str) {
        System.out.println(toString());
    }
}
