package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class CaptureScreenShot {
    public static void takeScreenshot(WebDriver driver, String name){
        try{
            File theDir = new File("src/main/java/screenshots/");
            if(!theDir.exists()){
                theDir.mkdir();
            }
            String imageName = name+".png";
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destiny = new File("src/main/java/screenshots/"+ imageName);
            FileHandler.copy(source,destiny);
        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
