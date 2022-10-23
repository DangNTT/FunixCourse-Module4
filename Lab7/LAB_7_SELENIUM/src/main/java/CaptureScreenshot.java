import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class CaptureScreenshot {
    private final String pathDriver="D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe";
    private WebDriver chrome;

//    Phuong thuc chup anh man hinh
    public static void takeScreenshot(WebDriver driver, String testcaseName){
        try{
            File theDir = new File("src/main/java/screenshots");
            if(!theDir.exists()){
                theDir.mkdir();
            }
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destiny = new File("src/main/java/screenshots/"+ testcaseName+".png");
            FileHandler.copy(source,destiny);
        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    //////Gọi trình duyệt Google Chrome
    @BeforeClass
    public void callWeb() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
    }

    ////////Mở URL: http://automationpractice.com/index.php
    ////////Quá trình tải trang không vượt quá 15s.
    @Test(priority = 0)
    public void getUrl() {
        chrome.get(PropertiesFileUtils.getProperty("base_url"));
        chrome.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    //Kiem tra nut signin co hien thi khong(dam bao chua dang nhap)
    @Test(priority = 1)
    public void checkSignin(){
        ExplicitWait.setWait("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a",10,chrome);
        WebElement signIn = chrome.findElement(By.xpath(
                "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        boolean visible = signIn.isDisplayed();
        Assert.assertEquals(true,visible,"Not displayed");
    }

    //Nhan vao nut signin
    @Test(priority = 2)
    public void clickIconSignIn() throws InterruptedException {
        ExplicitWait.setWait("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a",5,chrome);
        WebElement clickIconSignIn= chrome.findElement(By.xpath(
                "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        clickIconSignIn.click();
        chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    //Nhap email va mat khau vao
    @Test(priority = 3)
    public void enterEmail() throws InterruptedException {
        LoginPage.enterEmail(PropertiesFileUtils.getProperty("email_1"),chrome);
    }
    @Test(priority = 4)
    public void enterPassword() throws InterruptedException {
        LoginPage.enterPassword(PropertiesFileUtils.getProperty("password_1"),chrome);
    }

    //Dang nhap
    @Test(priority = 5)
    public void clickSignIn() throws InterruptedException {
        LoginPage.clickSignIn(chrome);
    }
    @Test(priority = 6)
    public void afterSignIn(){
        ExplicitWait.setWait("/html/body/div/div[2]/div/div[3]/div/p",5,chrome);
        WebElement afterSignIn=chrome.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/p"));
        boolean visible = afterSignIn.isDisplayed();
        Assert.assertEquals(true,visible,"Not displayed");
    }

    //Dang xuat
    @Test(priority = 7)
    public void clickSignOut() throws InterruptedException {
        ExplicitWait.setWait("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a",7,chrome);
        WebElement clickSignOut=chrome.findElement(By.xpath(
                "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        clickSignOut.click();
    }

//    //Dang nhap lai tai khoan khac
    @Test(priority = 8)
    public void enterEmail2() throws InterruptedException {
        LoginPage.enterEmail(PropertiesFileUtils.getProperty("email_2"),chrome);
    }
    @Test(priority = 9)
    public void enterPassword2() throws InterruptedException {
        LoginPage.enterPassword(PropertiesFileUtils.getProperty("password_2")
                ,chrome);
    }
    @Test(priority = 10)
    public void clickSignIn2() throws InterruptedException {
        LoginPage.clickSignIn(chrome);
    }
    ////Dam bao dang nhap lai thanh cong
    @Test(priority = 11)
    public void afterSignIn2() throws InterruptedException {
        ExplicitWait.setWait("/html/body/div/div[2]/div/div[3]/div/p",5,chrome);
        WebElement afterSignIn=chrome.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/p"));
        boolean visible = afterSignIn.isDisplayed();
        Assert.assertEquals(true,visible,"Not displayed");
    }

    @AfterMethod
    public void screenShot(ITestResult result) throws InterruptedException {
        Thread.sleep(1000);
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                CaptureScreenshot.takeScreenshot(chrome,result.getName());
                System.out.println("Da chup man hinh: "+result.getName());
            }catch (Exception e){
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }

    }

////        public static void main(String[] args) {
////        System.setProperty("webdrive.google.drive","D:\\1.tester\\Bai lab\\Automation\\Selenium\\");
////        ChromeDriver google = new ChromeDriver();
////        google.get("https://www.google.com.vn/");
////        google.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
////        google.manage().window().maximize();
////        CaptureScreenshot.takeScreenshot(google,"Hinh 1");
//    }
}
