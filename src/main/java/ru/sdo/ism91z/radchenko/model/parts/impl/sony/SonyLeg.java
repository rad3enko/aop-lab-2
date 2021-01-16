package ru.sdo.ism91z.radchenko.model.parts.impl.sony;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sdo.ism91z.radchenko.model.parts.Leg;

@Component
@Scope("prototype")
public class SonyLeg implements Leg {

    @Override
    public void go() {
        System.out.println("Go to Sony!");
    }
}
