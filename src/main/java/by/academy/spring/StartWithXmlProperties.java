package by.academy.spring;

import by.academy.spring.model.Group;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlProperties {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-with-properties.xml");

        Group ee = ctx.getBean("ee", Group.class);

        System.out.println(ee);

        ctx.close();

    }

}
