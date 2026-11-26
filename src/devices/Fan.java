package devices;

public class Fan implements SmartDevice {

    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is off.");
    }

    @Override
    public String getStatus() {
        return isOn ? "ON." : "OFF.";
    }
}
