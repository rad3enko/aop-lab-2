package ru.sdo.ism91z.radchenko.model.parts.impl.sony;

import ru.sdo.ism91z.radchenko.model.parts.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched!");
    }
}
