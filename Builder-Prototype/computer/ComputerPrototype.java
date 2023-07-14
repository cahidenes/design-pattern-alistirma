package org.example.computer;

import org.example.part.*;

import java.util.ArrayList;
import java.util.List;

public class ComputerPrototype {
    public static final Computer gamingComputer = new Computer(
            new ArrayList<>(List.of(new Storage[]{HDD.HDD1024, SSD.SSD256, SSD.SSD512})),
            new ArrayList<>(List.of(new RAM[]{RAM.RAM8, RAM.RAM16})),
            CPU.IntelCorei7,
            GPU.NvidiaRTX
        );

    public static final Computer officeComputer = new Computer(
            new ArrayList<>(List.of(new Storage[]{HDD.HDD512, HDD.HDD512})),
            new ArrayList<>(List.of(new RAM[]{RAM.RAM8, RAM.RAM8})),
            CPU.AMDRyzen9,
            null
    );
}
