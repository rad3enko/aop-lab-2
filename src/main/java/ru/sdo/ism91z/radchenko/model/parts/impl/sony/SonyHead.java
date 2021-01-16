package ru.sdo.ism91z.radchenko.model.parts.impl.sony;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sdo.ism91z.radchenko.model.parts.Head;

@Component
@Scope("prototype")
public class SonyHead implements Head {

    @Override
    public void calc() {
        System.out.println("Thinking about Sony");
    }
}
