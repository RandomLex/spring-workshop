package by.academy.spring;

import by.academy.spring.config.JavaBasedConfig;
import by.academy.spring.model.Group;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithJavaBasedConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBasedConfig.class);

        Group ee = ctx.getBean("ee", Group.class);

        System.out.println(ee);

        ctx.close();

    }

}
