package org.example;

import java.util.ArrayList;

public class ShapeFlyweight {
    int[] shape;
    private static ArrayList<int[]> flyweight_registry = new ArrayList<>();

    public ShapeFlyweight(int[] shape) {
        this.shape = getShape(shape);
    }

    private int[] getShape(int[] shape) {
        for (int[] flyweight : flyweight_registry) {
            if (flyweight.length == shape.length) {
                boolean match = true;
                for (int i = 0; i < shape.length; i++) {
                    if (flyweight[i] != shape[i]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return flyweight;
                }
            }
        }
        flyweight_registry.add(shape);
        return shape;
    }
}
