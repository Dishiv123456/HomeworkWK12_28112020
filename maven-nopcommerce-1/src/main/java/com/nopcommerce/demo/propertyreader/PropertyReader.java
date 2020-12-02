package com.nopcommerce.demo.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
    //Declare the PropertyReader Variable
    private static volatile PropertyReader propInstance;

    //create private constructor to prevent instantiation of the class
    private PropertyReader(){
    }
    //this method will return instance of propertyReader class
    public static synchronized PropertyReader getInstance(){
        if (propInstance ==null){
            propInstance=new PropertyReader();
        }
        return propInstance;
    }
    //this method will read property from property file
    public String getProperty(String propertyName){
        Properties prop = new Properties();
        FileInputStream inputStream =null;
        try {
            inputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\propertiesfile\\config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null){
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
        }
    }

