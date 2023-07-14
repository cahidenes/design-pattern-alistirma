package org.example.computer;

import org.example.part.CPU;
import org.example.part.GPU;
import org.example.part.RAM;
import org.example.part.Storage;

import java.util.ArrayList;

public class Computer {

    ArrayList<Storage> storageList;
    ArrayList<RAM> RAMList;
    CPU cpu;
    GPU gpu;

    public Computer(ArrayList<Storage> storageList, ArrayList<RAM> RAMList, CPU cpu, GPU gpu) {
        this.storageList = storageList;
        this.RAMList = RAMList;
        this.cpu = cpu;
        this.gpu = gpu;
    }
    
    public Computer(Computer computer) {
        this.storageList = new ArrayList<>(computer.storageList);
        this.RAMList = new ArrayList<>(computer.RAMList);
        this.cpu = computer.cpu;
        this.gpu = computer.gpu;
    }
}
