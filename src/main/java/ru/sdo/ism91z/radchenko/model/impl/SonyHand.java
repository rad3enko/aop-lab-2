package ru.sdo.ism91z.radchenko.model.impl;

import ru.sdo.ism91z.radchenko.model.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched!");
    }
}
