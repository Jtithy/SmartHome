//Import devices

import config.ConfigurationManager;
import devices.*;

public class Main {

    public static void main(String[] args) {

        //Smart Device instances
        SmartDevice light = new Light();
        SmartDevice fan = new Fan();
        SmartDevice ac = new AC();

        light.turnOn();
        fan.turnOn();
        ac.turnOn();
        System.out.println("Light status: " + light.getStatus());
        System.out.println("Fan status: " + fan.getStatus());
        System.out.println("AC status: " + ac.getStatus());
        System.out.println();

        light.turnOff();
        fan.turnOff();
        ac.turnOff();
        System.out.println();

        //Configuration Manager instance
        ConfigurationManager config1
                = ConfigurationManager.getInstance();

        config1.setHomeName("SmartHome");

        ConfigurationManager config2
                = ConfigurationManager.getInstance();

        System.out.println("Home Name: " + config2.getHomeName());

        System.out.println(config1 == config2);
    }
}
