package com.api.auto.utils;

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
}
