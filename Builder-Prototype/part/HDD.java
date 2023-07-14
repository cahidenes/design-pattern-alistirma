package org.example.part;

public enum HDD implements Storage {
    HDD256(250),
    HDD512(500),
    HDD1024(1000),
    HDD2048(2000);

    public final int cost;
    HDD(int cost) {
        this.cost = cost;
    }
}
