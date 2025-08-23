package com.gudii.singletonDesignPattern.config;

import com.gudii.singletonDesignPattern.SingletonDesignPatternApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {
    private static final Properties properties = new Properties();

    private ConfigurationManager(){
        InputStream is = ConfigurationManager.class.getClassLoader()
                .getResourceAsStream("config.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Bill Pugh
    private static class Holder{
        private static final ConfigurationManager configurationManage = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance(){
        return Holder.configurationManage;
    }
    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
