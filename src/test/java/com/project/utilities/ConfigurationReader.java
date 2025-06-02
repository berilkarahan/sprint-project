package com.project.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1. create the properties object
    //make it private so it is not accesible from the outside of the class. we are limiting access to the object

    //static is to make sure its created and loaded before everything else
    private static Properties properties = new Properties();

    static {

        try {
            //2.open file using FileInputStream
            FileInputStream file = new FileInputStream("confiquration.properties");

            //3.load the "properties" object with "file"
            properties.load(file);

            //close the file in the memory
            file.close();
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH");
            e.printStackTrace();

        }

    }

    //create a utility method to use the object to read

    //4.use "properties" object to read from the file

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }
}
