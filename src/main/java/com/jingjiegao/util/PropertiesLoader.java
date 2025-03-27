package com.jingjiegao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The type Properties loader.
 */
public class PropertiesLoader {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream("petstore.properties")) {
            if (input == null) {
                throw new RuntimeException("Cannot find petstore.properties file.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load petstore.properties", e);
        }
    }

    /**
     * Gets property.
     *
     * @param key the key
     * @return the property
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
