package Main.Factory;

import Main.Componant.Computer;
import Main.Componant.Server;

public class ServerFactory implements ComputerAbstractFactory {

    String  RAM,HDD,CPU;
    public ServerFactory(String RAM, String HDD, String CPU){
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;

    }

    @Override
    public Computer createComputer() {
        return new Server(RAM,HDD,CPU);
    }
}
