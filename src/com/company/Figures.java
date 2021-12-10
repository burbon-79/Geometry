package com.company;

public abstract class Figures {
    double x, y;

    abstract double getPerim();
    abstract double getArea();

    public Figures(double x, double y) {
        this.x = x;
        this.y = y;
    }


}
