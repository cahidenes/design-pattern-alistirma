package org.example.part;

public enum RAM {
    RAM4(250),
    RAM8(500),
    RAM16(1000),
    RAM32(2000);

    public final int cost;
    RAM(int cost) {
        this.cost = cost;
    }
}
