package org.example;


import org.example.computer.*;

public class Main {
    public static void main(String[] args) {
        // Builder Pattern
        for (int i = 0; i < 100; i++) {
            Computer gamingComputer = (Computer) Director.getGamingComputer(new ComputerBuilder());
            int gamingComputerCost = (int) Director.getGamingComputer(new ComputerValueBuilder());

            Computer officeComputer = (Computer) Director.getOfficeComputer(new ComputerBuilder());
            int officeComputerCost = (int) Director.getOfficeComputer(new ComputerValueBuilder());
        }

        // Prototype Pattern
        for (int i = 0; i < 100; i++) {
            Computer gamingComputer = new Computer(ComputerPrototype.gamingComputer);
            Computer officeComputer = new Computer(ComputerPrototype.officeComputer);
        }
    }


}