package Main;

import Main.Componant.Computer;
import Main.Factory.PCFactory;
import Main.Factory.ServerFactory;

public class Main {

    public static void main(String[] args) {

        Computer PC = ComputerFactory.getComputer(new PCFactory("2GB","1TB","i7"));
        Computer SERVER = ComputerFactory.getComputer(new ServerFactory("32GB","50TB","i9"));

        System.out.println(PC);
        System.out.println(SERVER);


    }
}
