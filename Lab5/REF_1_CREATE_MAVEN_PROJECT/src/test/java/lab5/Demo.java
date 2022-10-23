package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdrive.chrome.drive","D:\\1.tester\\Bai lab\\Automation\\Selenium");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.lambdatest.com/register");
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        WebElement span_checkbox = driver.findElement(By.xpath(
                "//span[contains(text(),'I agree to LambdaTest')]"));
        span_checkbox.click();
        WebElement a_click = driver.findElement(By.xpath(
                "//a[text()='Sign In']"));
        a_click.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
