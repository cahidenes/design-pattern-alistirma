package org.example;

public class Main {

    public static void main(String[] args) {

        Document document = new DocumentProxy();
        document.addDrawable(new MyCharacter('H', 0, 0));
        document.addDrawable(new MyCharacter('E', 10, 0));
        document.addDrawable(new MyCharacter('L', 20, 0));
        document.addDrawable(new MyCharacter('L', 30, 0));
        document.addDrawable(new MyCharacter('O', 40, 0));

        for (char c = 'A'; c <= 'Z'; c++) {
            try {
                document.addDrawable(new MyCharacter(c, 0, 10));
            } catch (Exception e) {
                System.out.println("Hatalı harf: " + c);
            }
        }
        document.draw();

    }
}