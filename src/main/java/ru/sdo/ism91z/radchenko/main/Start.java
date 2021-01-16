package ru.sdo.ism91z.radchenko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sdo.ism91z.radchenko.model.robot.Robot;

@ComponentScan(basePackages = "ru.sdo.ism91z.radchenko.config, ru.sdo.ism91z.radchenko.model")
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Start.class);
        Robot t1000robot = (Robot) context.getBean("t1000robot");
        t1000robot.fire();
    }
}
