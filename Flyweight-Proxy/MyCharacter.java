package org.example;

public class MyCharacter implements Drawable {

    int[] shape;
    int x, y;

    public MyCharacter(char c, int x, int y) {
        this.x = x;
        this.y = y;

        shape = CharacterMap.getInstance().characterMap.get(c);

    }

    @Override
    public int[] getCoordinates() {
        int[] ret = new int[shape.length];
        for (int i = 0; i < shape.length; i++) {
            if (i%2 == 0) {
                ret[i] = shape[i] + x;
            } else {
                ret[i] = shape[i] + y;
            }
        }
        return ret;
    }
}
