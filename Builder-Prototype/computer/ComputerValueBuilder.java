package org.example.computer;

import org.example.part.*;

public class ComputerValueBuilder implements Builder {
    private int cost;

    public ComputerValueBuilder() {
        cost = 0;
    }

    public ComputerValueBuilder addCPU(CPU cpu) {
        this.cost += cpu.cost;
        return this;
    }

    public ComputerValueBuilder addGPU(GPU gpu) {
        this.cost += gpu.cost;
        return this;
    }

    public ComputerValueBuilder addHDD(HDD hdd) {
        this.cost += hdd.cost;
        return this;
    }

    public ComputerValueBuilder addSSD(SSD ssd) {
        this.cost += ssd.cost;
        return this;
    }

    public ComputerValueBuilder addRAM(RAM ram) {
        this.cost += ram.cost;
        return this;
    }

    public Integer build() {
        return cost;
    }

}
