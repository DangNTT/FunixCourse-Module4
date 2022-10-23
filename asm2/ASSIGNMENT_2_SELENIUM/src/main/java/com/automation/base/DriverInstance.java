package com.automation.base;

import com.automation.utils.PropertiesFileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DriverInstance {
    protected WebDriver driver;
    //////Gọi trình duyệt Google Chrome
    // khởi tạo chrome driver
    //và set max size cho cửa sổ trình duyệt
    @BeforeClass
    public void initDriverInstance() {
        //cái này có thể thêm thư viện webdrivermanager để có thể tự động cài chrome hoặc gecko thông qua
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver",PropertiesFileUtils.getProperty("pathDriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    //đóng trình duyệt
    @AfterClass
    public void closeDriverInstance() throws InterruptedException {
        driver.close();
    }
}
