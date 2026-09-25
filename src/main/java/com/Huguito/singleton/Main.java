package com.Huguito.singleton;

public class Main {
    public static void main(String[] args){
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();

        System.out.println(config1 == config2);
    }
}
