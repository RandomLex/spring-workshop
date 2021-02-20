package by.academy.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group implements Printable {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    @Override
    public void print(String str) {
        System.out.println(toString());
    }

}
