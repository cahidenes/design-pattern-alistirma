package org.example.computer;

import org.example.part.*;

public class Director {

    public static Object getGamingComputer(Builder builder) {
        return builder.addHDD(HDD.HDD1024)
                .addSSD(SSD.SSD256)
                .addSSD(SSD.SSD512)
                .addRAM(RAM.RAM8)
                .addRAM(RAM.RAM16)
                .addCPU(CPU.IntelCorei7)
                .addGPU(GPU.NvidiaRTX)
                .build();
    }

    public static Object getOfficeComputer(Builder builder) {
        return builder.addHDD(HDD.HDD512)
                .addHDD(HDD.HDD512)
                .addRAM(RAM.RAM8)
                .addRAM(RAM.RAM8)
                .addCPU(CPU.AMDRyzen9)
                .build();
    }

}
