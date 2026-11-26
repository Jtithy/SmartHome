package devices;

public class Light implements SmartDevice {

    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is off.");
    }

    @Override
    public String getStatus() {
        return isOn ? "ON." : "OFF.";
    }
}
