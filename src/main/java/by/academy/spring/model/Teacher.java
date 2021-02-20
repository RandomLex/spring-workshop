package by.academy.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Teacher extends Person {
    private int salary;

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
