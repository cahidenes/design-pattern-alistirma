package org.example.computer;

import org.example.part.*;

import java.util.ArrayList;

public class ComputerBuilder implements Builder {
    private ArrayList<Storage> storageList;
    private ArrayList<RAM> RAMList;
    private CPU cpu;
    private GPU gpu;

    public ComputerBuilder() {
        storageList = new ArrayList<>();
        RAMList = new ArrayList<>();
    }

    public ComputerBuilder addCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder addGPU(GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder addHDD(HDD hdd) {
        storageList.add(hdd);
        return this;
    }

    public ComputerBuilder addSSD(SSD ssd) {
        storageList.add(ssd);
        return this;
    }

    public ComputerBuilder addRAM(RAM ram) {
        RAMList.add(ram);
        return this;
    }

    public Computer build() {
        if (storageList.isEmpty()) {
            throw new IllegalStateException("Computer must have at least one storage device");
        }
        if (RAMList.isEmpty()) {
            throw new IllegalStateException("Computer must have at least one RAM device");
        }
        if (cpu == null) {
            throw new IllegalStateException("Computer must have a CPU");
        }
        return new Computer(storageList, RAMList, cpu, gpu);
    }
}
