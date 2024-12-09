public static void main(String[] args) {
    // Instance 1
    Configuration config1 = Configuration.getInstance();
    config1.addSetting("theme", "dark");
    config1.addSetting("language", "English");

    // Instance 2
    Configuration config2 = Configuration.getInstance();
    config2.addSetting("volume", 70);

    // Verifying that both instances are the same
    System.out.println(config1 == config2); // True, both are the same instance

    // Checking shared settings
    System.out.println("Theme: " + config1.getSetting("theme")); // "dark"
    System.out.println("Volume: " + config2.getSetting("volume")); // 70

    // Printing all settings
    config1.printSettings();
}
