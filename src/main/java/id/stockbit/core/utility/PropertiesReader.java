package id.stockbit.core.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertiesReader {
    protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public String getPropertiesFromCustomSource(String fileName, String value){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        String propertyName = "";

        try {
            InputStream inputStream = loader.getResourceAsStream(fileName);
            if (inputStream == null){
                properties.load(new FileInputStream("src/main/resources/application.properties"));
                propertyName = properties.getProperty(value);
                LOGGER.info("Force to read application.properties file [" + propertyName + "]!");
            } else {
                properties.load(inputStream);
                propertyName = properties.getProperty(value);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        if (propertyName.isEmpty()){
            LOGGER.info("Something went wrong, cant retrieve application.properties value [" + value + "]");
        }
        return propertyName;
    }

    public String getProperties(String properties){
        String propertyValue = getPropertiesFromCustomSource("application.properties", properties);
        if (propertyValue == null){
            LOGGER.info("Your properties is null or it is not registered on the file! Please double check if your property is placed in the proper folder [src/main/resources]");
            System.exit(0);
        }
        return propertyValue;
    }

}
