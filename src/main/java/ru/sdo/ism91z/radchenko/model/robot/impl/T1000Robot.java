package ru.sdo.ism91z.radchenko.model.robot.impl;

import ru.sdo.ism91z.radchenko.model.parts.Hand;
import ru.sdo.ism91z.radchenko.model.parts.Head;
import ru.sdo.ism91z.radchenko.model.parts.Leg;
import ru.sdo.ism91z.radchenko.model.robot.Robot;

public class T1000Robot implements Robot {

    private final Head head;
    private final Hand hand;
    private final Leg leg;

    public T1000Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
