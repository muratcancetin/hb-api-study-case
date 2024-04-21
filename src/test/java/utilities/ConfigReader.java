package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static{
        String configPath = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(configPath);
            properties = new Properties();
            properties.load(fileInputStream);
        }
        catch (IOException e){
            System.out.println("properties dosyası okunurken hata olustu");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}