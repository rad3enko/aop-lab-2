package ru.sdo.ism91z.radchenko.model.parts.impl.toshiba;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sdo.ism91z.radchenko.model.parts.Hand;

@Component
@Scope("prototype")
public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched Toshiba!");
    }
}
