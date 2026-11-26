//Import devices

import devices.*;

public class Main {

    public static void main(String[] args) {
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

    }
}
