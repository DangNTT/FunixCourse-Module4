import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
    @BeforeTest
    public void test1(){
        Assert.assertEquals(5,6,"Loi");
        System.out.println("Hello test 1");
    }
    @AfterTest
    public void test2(){
        System.out.println("Hello test 2");
    }
    @Test(priority = 2)
    public void test3(){
        System.out.println("Hi test 3");
    }
    @Test(priority = 1)
    public void test4() {
        System.out.println("Hay test toi truoc");
    }


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.facebook.com/");
        driver.quit();
        Select
    }
}
