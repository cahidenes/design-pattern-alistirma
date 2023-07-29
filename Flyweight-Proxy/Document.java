package org.example;

import java.util.ArrayList;

public class Document {
    ArrayList<Drawable> drawables;

    public Document() {
        drawables = new ArrayList<Drawable>();
    }

    public void addDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public void draw() {
        for (Drawable drawable : drawables) {
            int[] coordinates = drawable.getCoordinates();
            for (int i = 0; i < coordinates.length; i += 2)
                System.out.println("Drawing at (" + coordinates[i] + ", " + coordinates[i+1] + ")");
        }
    }
}
