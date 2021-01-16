package ru.sdo.ism91z.radchenko.start;

import ru.sdo.ism91z.radchenko.model.impl.SonyHand;
import ru.sdo.ism91z.radchenko.model.impl.SonyLeg;
import ru.sdo.ism91z.radchenko.model.impl.ToshibaHead;

public class Robot {

    private final ToshibaHead head;
    private final SonyHand hand;
    private final SonyLeg leg;

    public Robot(ToshibaHead head, SonyHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
