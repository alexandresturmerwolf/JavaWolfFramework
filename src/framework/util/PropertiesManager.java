package framework.util;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author wolfi
 */
public class PropertiesManager {

    public Properties properties = null;

    public PropertiesManager(String fileName) {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(fileName);
            properties.load(file);
        } catch (Exception e) {
            ExceptionAnaliser.ExceptionCenter(e);
        }
    }
    
    public void close(){
        properties.clear();
    }
}
