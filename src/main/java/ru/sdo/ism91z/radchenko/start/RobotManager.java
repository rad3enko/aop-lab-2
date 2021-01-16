package ru.sdo.ism91z.radchenko.start;

import ru.sdo.ism91z.radchenko.model.impl.SonyHand;
import ru.sdo.ism91z.radchenko.model.impl.SonyLeg;
import ru.sdo.ism91z.radchenko.model.impl.ToshibaHead;

public class RobotManager {
    public static void main(String[] args) {

        ToshibaHead head = new ToshibaHead();
        SonyHand hand = new SonyHand();
        SonyLeg leg = new SonyLeg();

        Robot robot = new Robot(head, hand, leg);
        robot.action();
    }
}
