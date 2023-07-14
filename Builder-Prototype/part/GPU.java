package org.example.part;

public enum GPU {
    NvidiaRTX(15000),
    NvidiaGTX(10000),
    NvidiaMX(5000),
    AMDRadeon(5000);

    public final int cost;
    GPU(int cost) {
        this.cost = cost;
    }
}
