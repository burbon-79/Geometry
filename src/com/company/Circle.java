package com.company;

public class Circle extends Figures implements Moveable{
    double R;

    public Circle(double x, double y, double R) {
        super(x, y);
        this.R = R;
        Center();
        Side();
    }

    double getPerim() {
        return 0;
    }

    double getArea() {
        System.out.println("У круга периметра нет, зато есть длина");
        return 2 * R * Math.PI;
    }


    public void Center() {
        System.out.println("Center: (" + x + ", " + y + ")");
    }

    public void Side() {
        System.out.println("Radius: " + R);
    }
}
