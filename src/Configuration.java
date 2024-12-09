public class Configuration {
    // Static field to hold the single instance
    private static Configuration instance;

    // Storage for configuration settings
    private final java.util.Map<String, Object> settings = new java.util.HashMap<>();

    // Private constructor to prevent instantiation
    private Configuration() {
    }

    // Public method to provide access to the single instance
    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }

    // Method to add or update a setting
    public void addSetting(String key, Object value) {
        settings.put(key, value);
    }

    // Method to retrieve a setting
    public Object getSetting(String key) {
        return settings.get(key);
    }

    // Method to print all settings
    public void printSettings() {
        settings.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}