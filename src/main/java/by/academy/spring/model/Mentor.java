package by.academy.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Mentor extends Teacher {
    private int salary;
    private List<String> certificates;

    public Mentor(int id, String name) {
        super(id, name);
    }

    public Mentor(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void print(String str) {
        System.out.println(toString());
    }

}
