package org.example;

public class DocumentProxy extends Document {

    @Override
    public void addDrawable(Drawable drawable) {
        int[] shapes = drawable.getCoordinates();
        if (shapes.length % 2 == 1) {
            throw new IllegalArgumentException("Drawable must have an even number of coordinates");
        }
        if (shapes[0] != shapes[shapes.length - 2] || shapes[1] != shapes[shapes.length - 1]) {
            throw new IllegalArgumentException("Drawable must be closed");
        }
        super.addDrawable(drawable);
    }

    @Override
    public void draw() {
        super.draw();
    }
}
