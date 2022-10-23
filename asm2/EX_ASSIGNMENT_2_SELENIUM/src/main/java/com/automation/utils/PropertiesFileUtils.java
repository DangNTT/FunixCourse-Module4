package com.automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
    private static final String URL = "src/main/java/configuration/configs.properties";
    Properties file = new Properties();
    public static String getProperty(String key){
        FileReader pro=null;
        Properties p=null;
        try{
            pro=new FileReader(URL);
            p=new Properties();
            p.load(pro);
        }catch (IOException e){
            System.out.println(e.toString());
        }
        return p.getProperty(key);
    }
}
