package org.example.part;

public enum CPU {
    IntelCorei5(3000),
    IntelCorei7(10000),
    AMDRyzen7(12000),
    AMDRyzen9(19000);

    public final int cost;
    CPU(int cost) {
        this.cost = cost;
    }

}
