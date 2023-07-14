package org.example.part;
public enum SSD implements Storage {
    SSD128(250),
    SSD256(500),
    SSD512(1000),
    SSD1024(2000);

    public final int cost;
    SSD(int cost) {
        this.cost = cost;
    }
}
