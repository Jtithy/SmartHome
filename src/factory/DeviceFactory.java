package factory;

import devices.SmartDevice;
import devices.Light;
import devices.Fan;
import devices.AC;

public class DeviceFactory {

    public static SmartDevice createDevice(String deviceType) {
        if (deviceType == null) {
            throw new IllegalArgumentException("Device type cannot be null.");
        } else if (deviceType.equalsIgnoreCase("Light")) {
            return new Light();
        } else if (deviceType.equalsIgnoreCase("Fan")) {
            return new Fan();
        } else if (deviceType.equalsIgnoreCase("AC")) {
            return new AC();
        } else {
            throw new IllegalArgumentException("Unknown device type: please provide a valid device type.");
        }
    }
}
