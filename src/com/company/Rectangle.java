package com.company;

public class Rectangle extends Figures implements Moveable{
    double height, width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
        Center();
        Side();
    }

    double getPerim() {
        return 2*(height+width);
    }
    double getArea() {
        return 0;
    }

    public void Center() {
        double centerx = width/2+x;
        double centery = height/2+y;
        System.out.println("Center: (" + centerx + ", " + centery + ")");
    }

    public void Side() {
        System.out.println("Height: " + height + "\n" + "Width: " + width);
    }
}
