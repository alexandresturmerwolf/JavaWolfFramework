package framework.util;

import framework.base.Constants;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {

    public Properties properties = null;

    public PropertiesManager(String fileName) {
        properties = new Properties();
        String filePath = Constants.BASE_PATH + fileName;
        try {
            ExceptionAnaliser.info("Property file: " + filePath);
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
        } catch (Exception e) {
            ExceptionAnaliser.errorException(e);
        }
    }

    public String getProperty(String property) {
        String ret = properties.getProperty(property);
        ExceptionAnaliser.info("Property read: " + ret);
        return ret;
    }

    public void close() {
        properties.clear();
    }
}
