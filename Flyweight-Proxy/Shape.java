package org.example;

public class Shape implements Drawable {

    ShapeFlyweight flyweight;
    int x, y;
    public Shape(int[] shape, int x, int y) {
        flyweight = new ShapeFlyweight(shape);
        this.x = x;
        this.y = y;
    }

    @Override
    public int[] getCoordinates() {
        int[] ret = new int[flyweight.shape.length];
        for (int i = 0; i < flyweight.shape.length; i++) {
            if (i%2 == 0) {
                ret[i] = flyweight.shape[i] + x;
            } else {
                ret[i] = flyweight.shape[i] + y;
            }
        }
        return ret;
    }
}
