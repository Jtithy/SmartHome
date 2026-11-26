package devices;

public class AC implements SmartDevice {

    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("AC is on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("AC is off.");
    }

    @Override
    public String getStatus() {
        return isOn ? "ON." : "OFF.";
    }
}
