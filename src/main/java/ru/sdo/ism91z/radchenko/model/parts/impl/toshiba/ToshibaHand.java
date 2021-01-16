package ru.sdo.ism91z.radchenko.model.parts.impl.toshiba;

import ru.sdo.ism91z.radchenko.model.parts.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched!");
    }
}
