package com.automation.utils;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
    private static final String PATH = "src/main/java/configuration/configs.properties";
    Properties file = new Properties();


    public static String getProperty(String key) {
        FileReader pro = null;
        Properties p = null;
        try {
            pro = new FileReader(PATH);
            p = new Properties();
            p.load(pro);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return p.getProperty(key);
    }


    //phương thức set property
    public void setProperty(String key, String value){
        Properties properties= new Properties();
        FileOutputStream fileOutputStream = null;
        try {
            //Khởi tạo giá trị cho đối tượng FileOutputStream
            fileOutputStream = new FileOutputStream(PATH);
            //Load properties file hiện tại và thực hiện mapping value
            //với key tương ứng
            properties.setProperty(key, value);
            //Lưu key và value vào properties file
            properties.store(fileOutputStream, "Set new value in properties");
            System.out.println("Set new value in file properties success.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //luôn nhảy vào đây dù có xảy ra exception hay không.
            //thực hiện đóng luồng ghi
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
