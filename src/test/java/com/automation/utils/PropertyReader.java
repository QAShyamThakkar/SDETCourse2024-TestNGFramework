package com.automation.utils;

import com.google.j2objc.annotations.Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyReader {

   static Properties property;

    public static void initProperty() {
        property = new Properties();

        try {
            property.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        PropertyReader.initProperty();
        return property.getProperty(key);

    }
}
