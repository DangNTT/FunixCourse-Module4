 package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThucHanh {
    private String url="https://www.google.com.vn/";
    private ChromeDriver google;
//●	Gọi trình duyệt Google Chrome.
//●	Mở URL: https://www.google.com.vn/
//●	Cài đặt thời gian tải trang không vượt quá 15s.
    @BeforeTest
    public void getGoogle(){
        System.setProperty("webdriver.chrome.driver","D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe");
        google = new ChromeDriver();
        google.manage().window().maximize();
    }
    @Test(priority = 0)
    public void getUrl(){
        google.get("https://www.google.com.vn/");
        google.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    }
//    ●	Nhấp vào hộp văn bản Tìm kiếm của Google.
    @Test(priority = 1)
    public void getElement(){
        WebElement input_textbox = google.findElement(By.xpath(
                "//input[@class='gLFyf gsfi' and @type ='text' and @title = 'Tìm kiếm']"));
        input_textbox.click();
    }

//    ●	Nhập giá trị “selenium”
    @Test(priority = 2)
    private void checkSendkeys(){
        WebElement input_textbox = google.findElement(By.xpath(
                "//input[@class='gLFyf gsfi' and @type ='text' and @title = 'Tìm kiếm']"));
        input_textbox.click();
        input_textbox.sendKeys("selenium");
    }


    @Test(priority = 3)
    public void clickOutside() {
        Actions action = new Actions(google);
        action.moveByOffset(0, 0).click().build().perform();

    }
//●	Bấm vào nút Tìm kiếm.(“Tìm trên google”)
    @Test(priority = 4)
    public void checkButtonSearch() throws InterruptedException {
        WebElement input_button = google.findElement(By.xpath("//input[@name='btnK' and @type='submit']"));
        input_button.submit();
        Thread.sleep(5000);
    }

//    ●	Đóng trình duyệt.
    @AfterTest
    public void quit(){
        google.close();
    }
}
