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
