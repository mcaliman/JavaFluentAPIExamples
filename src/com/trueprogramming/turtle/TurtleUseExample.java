package com.trueprogramming.turtle;

/**
 *
 * @author mcaliman
 */
public class TurtleUseExample {

    public static void main(String[] args) {
        Turtle t = new Turtle("Spot", 0, 0, true, true);
        t.penDown().hide().moveTo(10, 10).show().turn(-90).move(100).turn(+180);
    }

}
