package com.trueprogramming.turtle;

import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.toRadians;

/**
 * The turtle of Logo language implemented with fluent API.
 *
 * @author Massimo Caliman
 */
public class Turtle {

    private static final Logger LOG = Logger.getLogger(Turtle.class.getName());
    private static final Level LEVEL = Level.OFF;

    /**
     * The turtle name.
     */
    public String name;

    /**
     * X coordinate of turtle.
     */
    public double x;

    /**
     * Y coordinate of turtle
     */
    public double y;

    /**
     * The angle in degrees.
     */
    public double angle;

    /**
     * Pen status (down or up), true if pen is down, false otherwise.
     */
    public boolean penDown;

    /**
     * The turtle is hidden? true if turtle is hidded, false otherwise.
     */
    public boolean hidden;

    /**
     * Costruct a turtle
     *
     * @param name
     * @param x
     * @param y
     * @param penDown
     * @param hidden
     */
    public Turtle(String name, double x, double y, boolean penDown, boolean hidden) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.penDown = penDown;
        this.hidden = hidden;
        LOG.log(LEVEL, "the turtle is initialized to values of the tuple {0}", this.toString());
    }

    public Turtle move(double steps) {
        double radians = toRadians(angle);
        this.x = x + cos(radians) * steps;
        this.y = y + sin(radians) * steps;
        LOG.log(LEVEL, "call move({0}). the turtle is set to values of the tuple {1}", new Object[]{steps, this.toString()});
        return this;
    }

    public Turtle moveTo(double x, double y) {
        this.x = x;
        this.y = y;
        LOG.log(LEVEL, "call moveTo({0},{1}). the turtle is set to values of the tuple {2}", new Object[]{x, y, this.toString()});
        return this;
    }

    public Turtle turn(double angle) {
        this.angle = (this.angle + angle) % 360;
        LOG.log(LEVEL, "call turn({0}). the turtle is set to values of the tuple {1}", new Object[]{angle, this.toString()});
        return this;
    }

    public Turtle penUp() {
        penDown = false;
        LOG.log(LEVEL, "the pen is up now.");
        return this;
    }

    public Turtle penDown() {
        penDown = true;
        LOG.log(LEVEL, "the pen is down now.");
        return this;
    }

    public Turtle hide() {
        hidden = true;
        LOG.log(LEVEL, "the turtle is hidden now.");
        return this;
    }

    public Turtle show() {
        hidden = false;
        LOG.log(LEVEL, "the turtle is visible now.");
        return this;
    }

    @Override
    public String toString() {
        return "Turtle{" + "name=" + name + ", x=" + x + ", y=" + y + ", angle=" + angle + ", penDown=" + penDown + ", hidden=" + hidden + '}';
    }

}
