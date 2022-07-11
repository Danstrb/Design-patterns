package com.utgard.creationalPatterns.singleton;

public class SingletonDemo {
    public void show() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Mosh");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
