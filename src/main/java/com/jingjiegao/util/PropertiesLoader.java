package com.jingjiegao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream("swapi.properties")) {
            if (input == null) {
                throw new RuntimeException("Cannot find swapi.properties file.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load swapi.properties", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
