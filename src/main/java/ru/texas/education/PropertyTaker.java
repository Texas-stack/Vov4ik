package ru.texas.education;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertyTaker {
    public String takeProperty(String name, String key) {
        Properties property = new Properties();
        try (InputStream input = PropertyTaker.class.getClassLoader().getResourceAsStream(name + ".properties")) {
            if (input == null) {
                System.out.println("Извините, не удалось найти файл task1.properties");
            }
            // Используем InputStreamReader с кодировкой UTF-8
            assert input != null;
            try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
                property.load(reader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property.getProperty(key);
    }
}
