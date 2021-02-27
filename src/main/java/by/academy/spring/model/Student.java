package by.academy.spring.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

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

    public Map<String, Integer> getMarks() {
        return this.marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
}
