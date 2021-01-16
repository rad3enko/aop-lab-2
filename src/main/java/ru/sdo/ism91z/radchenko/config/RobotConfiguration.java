package ru.sdo.ism91z.radchenko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sdo.ism91z.radchenko.model.parts.Hand;
import ru.sdo.ism91z.radchenko.model.parts.Head;
import ru.sdo.ism91z.radchenko.model.parts.Leg;
import ru.sdo.ism91z.radchenko.model.robot.Robot;
import ru.sdo.ism91z.radchenko.model.robot.impl.T1000Robot;

@Configuration
public class RobotConfiguration {

    @Bean
    public Robot t1000robot(Head toshibaHead, Hand sonyHand, Leg sonyLeg) {
        return new T1000Robot(toshibaHead, sonyHand, sonyLeg);
    }
}
