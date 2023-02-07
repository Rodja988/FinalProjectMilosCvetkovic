package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String validUsername, validPassword, invalidUsername, invalidPassword;
    private static String configFilePath = "src/main/resources/configuration.properties";
    private static PropertyManager instance;

    public static PropertyManager getInstance(){
        if (instance == null){
            instance = new PropertyManager();
            instance.loadData();
        } return instance;
    }
    private void loadData(){
        Properties properties = new Properties();
        try {
            FileInputStream finput = new FileInputStream(configFilePath);
            properties.load(finput);
        } catch (Exception e){
            e.printStackTrace();
        }
        validUsername = properties.getProperty("validUsername");
        validPassword = properties.getProperty("validPassword");
        invalidUsername = properties.getProperty("invalidUsername");
        invalidPassword = properties.getProperty("invalidPassword");


    }
    public String getValidUsername(){
        return validUsername;
    }
    public String getValidPassword(){
        return validPassword;
    }
    public String getInvalidUsername(){
        return invalidUsername;
    }
    public String getInvalidPassword(){
        return invalidPassword;
    }
}
