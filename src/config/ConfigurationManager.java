// ConfigurationManager.java
// This class is responsible for managing the application's configuration.
// It implements the Singleton design pattern to ensure that only one instance of the configuration manager exists throughout the application lifecycle.
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

    //Additional configuration method
    private String homeName;

    //Getter and Setter for homeName
    public void setHomeName(String name) {
        this.homeName = name;
    }

    public String getHomeName() {
        return this.homeName;
    }
}
