package by.academy.spring;

import by.academy.spring.config.JavaBasedConfig;
import by.academy.spring.model.Group;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("by.academy.spring");

        Group ee = ctx.getBean("ee", Group.class);

        System.out.println(ee);

        ctx.close();

    }

}
