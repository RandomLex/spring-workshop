package by.academy.spring;

import by.academy.spring.model.Group;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

//        Group ee = (Group) ctx.getBean("ee");
        Group ee = ctx.getBean("ee", Group.class);

        System.out.println(ee);

        System.out.println(ctx.getBean("testGroup", Group.class));


        ctx.close();

    }

}
