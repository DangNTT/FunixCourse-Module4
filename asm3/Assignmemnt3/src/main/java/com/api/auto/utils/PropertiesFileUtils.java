package com.api.auto.utils;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
    private static final String URL = "src/main/java/configuration/configs.properties";
    private static final String TOKEN_PATH  = "src/main/java/configuration/token.properties";
    Properties file = new Properties();

    //////////// 1 Lấy ra giá trị property từ config file bất kỳ theo key.
    public static String getProperty(String key) {
        FileReader pro=null;
        Properties p=null;
        try{
            pro=new FileReader(URL);
            p=new Properties();
            p.load(pro);
        }catch (IOException e){
            System.out.println(e.toString());
        } finally {
            // luôn nhảy vào đây dù có xảy ra exception hay không.
            // thực hiện đóng luồng đọc
            if (pro !=null){
                try {
                    pro.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return p.getProperty(key);
    }
    public static void setProperty(String key, String value){
        Properties properties= new Properties();
        FileOutputStream fileOutputStream = null;
        try {
            //Khởi tạo giá trị cho đối tượng FileOutputStream
            fileOutputStream = new FileOutputStream(TOKEN_PATH);
            //Load properties file hiện tại và thực hiện mapping value
            //với key tương ứng
            properties.setProperty(key, value);
            //Lưu key và value vào properties file
            properties.store(fileOutputStream, "Set new value in properties");
            System.out.println("Set new value in file properties success.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // 3 lấy ra token
    public static String getToken() {
        FileReader pro=null;
        Properties p=null;
        try{
            pro=new FileReader(TOKEN_PATH);
            p=new Properties();
            p.load(pro);
        }catch (IOException e){
            System.out.println(e.toString());
        } finally {
            if (pro !=null){
                try {
                    pro.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return p.getProperty("token");
    }

}
