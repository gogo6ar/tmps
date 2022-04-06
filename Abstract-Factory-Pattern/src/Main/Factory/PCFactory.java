package Main.Factory;

import Main.Componant.Computer;
import Main.Componant.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String RAM,HDD,CPU;

    public PCFactory(String RAM, String HDD, String CPU){
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new PC(RAM,HDD,CPU);
    }
}
