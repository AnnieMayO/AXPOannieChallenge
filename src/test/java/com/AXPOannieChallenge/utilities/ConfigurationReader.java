package com.AXPOannieChallenge.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

//    private static Properties properties;
//    static {
//        try {
//            String path = "configuration.properties";
//            FileInputStream input = new FileInputStream(path);
//            properties = new Properties();
//            properties.load(input);
//            input.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public static String get(String keyName) {
//
//        return properties.getProperty(keyName);
//    }
//}

    //1- Create the Properties object (create object)
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.
    private static Properties properties = new Properties();

    static{

        try {
            //2- Open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- Load the "properties" object with "file" (load properties)
            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();
        }
    }

    public static String get(String url) {
        return properties.getProperty(url);
    }


    //create a utility method to use the object to read
    //4- Use "properties" object to read from the file (read properties)

    public String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}