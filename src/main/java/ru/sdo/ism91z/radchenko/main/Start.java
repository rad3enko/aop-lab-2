package ru.sdo.ism91z.radchenko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sdo.ism91z.radchenko.model.robot.Robot;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Robot t1000robot = (Robot) context.getBean("t1000robot");
        t1000robot.fire();
    }
}
