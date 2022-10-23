import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyStoreAutomation {
    private String url = "http://automationpractice.com/index.php";
    private String keyWork = "12345";
    private ChromeDriver chrome;

    //////Gọi trình duyệt Google Chrome
    @BeforeClass
    public void init() {
        System.setProperty("webdriver.chrome.driver","D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
    }

    ////////Mở URL: http://automationpractice.com/index.php
    ////////Quá trình tải trang không vượt quá 15s.
    @Test(priority = 0)
    public void getUrl() {
        chrome.get("http://automationpractice.com/index.php");
        chrome.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
//Nhấn vào ô search
    @Test(priority = 1)
    public void getElement() {
        WebElement input_textbox = chrome.findElement(By.xpath(
                "//input[@id='search_query_top']"));
        input_textbox.click();
    }
////Nhập text tìm kiếm "Faded Short Sleeve T-shirts"
    @Test(priority = 2)
    private void checkSendkeys() {
        WebElement input_textbox = chrome.findElement(By.xpath(
                "//input[@id='search_query_top']"));
        input_textbox.click();
        input_textbox.sendKeys("Faded Short Sleeve T-shirts");
    }
//    //kiểm tra và nhấn nút tìm kiếm
    @Test(priority = 3)
    public void checkButtonSearch(){
        WebElement clcik_button = chrome.findElement(By.xpath(
                "//button[@type='submit' and @name='submit_search']"));
        clcik_button.click();
        chrome.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    }
//kiểm tra ảnh có hiển thị không
    @Test(priority = 4)
    public void checkHienThiImage(){
        WebElement checkHienThi = chrome.findElement(By.xpath(
                "//div[@class='product-image-container']"));
        boolean visible = checkHienThi.isDisplayed();
        Assert.assertEquals(true,visible,"Chua hien thi");
    }
//Kiểm tra hiển thị đúng sản phẩm
    @Test(priority = 5)
    public void checkEquals(){
        WebElement checkEquals = chrome.findElement(By.xpath(
                "//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']"));
        Assert.assertEquals(checkEquals.getText(),"Faded Short Sleeve T-shirts","Ket qua khong giong nhau");
    }

    @Test(priority = 6)
    public void checkGia(){
//        boolean visible = CommonFunction.isExist(chrome,"//span[@itemprop='price' and @class='price product-price']");
//        Assert.assertTrue(visible);
        WebElement gia=chrome.findElement(By.xpath(
                "//h5[.//a[@title='Faded Short Sleeve T-shirts']]/following-sibling::div[@itemprop='offers' and @class='content_price']"));
        Assert.assertEquals(true,gia.isDisplayed(),"k Co hien thi");
    }
    @Test(priority = 7)
    public void checkNotDisplayed(){
        WebElement  btnAddToCart=chrome.findElement(By.xpath(
                "//a[@title='Add to cart']"));
        boolean visible = btnAddToCart.isDisplayed();
        Assert.assertEquals(false,visible,"Error");
    }
    @Test(priority = 8)
    public void checkDiChuot() throws InterruptedException {
        Thread.sleep(5000);
        WebElement diChuot = chrome.findElement(By.xpath(
                "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']"));
        Actions action = new Actions(chrome);
        action.moveToElement(diChuot).perform();
        WebElement  btnAddToCart=chrome.findElement(By.xpath(
                "//a[@title='Add to cart']"));
        boolean visible = btnAddToCart.isDisplayed();
        Assert.assertEquals(true,visible,"Error");
    }
    @Test(priority = 9)
    public void checkClickAddCart() throws Throwable{
        //di chuột vào nút add
        WebElement diChuot = chrome.findElement(By.xpath(
                "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']"));
        Actions action = new Actions(chrome);
        action.moveToElement(diChuot).perform();
        //nhấn chuột vào nút add
        WebElement button_add = chrome.findElement(By.xpath(
                "//a[@class='button ajax_add_to_cart_button btn btn-default' and @title='Add to cart']"));
        button_add.click();
        Thread.sleep(3000);
        //Kiểm tra thêm hàng vào giỏ thành công
        WebElement checkCart= chrome.findElement(By.xpath(
                "//div[@class='clearfix']/div[@class='layer_cart_product col-xs-12 col-md-6']" +
                        "/div[@class='layer_cart_product_info']/span[@id='layer_cart_product_title']"));
        boolean visible = checkCart.isDisplayed();
        Assert.assertEquals(true,visible,"no dislay");
    }

    @AfterClass
    public void terminate() throws InterruptedException {
        Thread.sleep(5000);
        chrome.close();
    }
}
