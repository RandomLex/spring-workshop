package by.academy.spring;

import by.academy.spring.model.Group;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

//        Group ee = (Group) ctx.getBean("ee");
        Group ee = ctx.getBean("ee", Group.class);

        System.out.println(ee);
    }

}
