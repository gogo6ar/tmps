package Main;

import Main.Componant.Computer;
import Main.Factory.ComputerAbstractFactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
