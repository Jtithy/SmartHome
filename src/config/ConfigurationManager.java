package config;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;

    private ConfigurationManager() {
        System.out.println("Configuration Manager Initialized");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}
