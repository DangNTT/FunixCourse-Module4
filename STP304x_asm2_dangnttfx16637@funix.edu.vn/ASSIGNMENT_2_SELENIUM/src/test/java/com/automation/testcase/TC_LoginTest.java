package com.automation.testcase;

import com.automation.base.DriverInstance;
import com.automation.pom.LoginPage;
import com.automation.utils.CaptureScreenShot;
import com.automation.utils.PropertiesFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class TC_LoginTest extends DriverInstance {

    @DataProvider(name = "excel")
    public Object[][] getDataFromExcel() throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/data/assignment2_data_test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet loginSheet = workbook.getSheet("Login");
        int numberOfRowData = loginSheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[numberOfRowData][2]; //có 2 cột (usernamr/pass) & n hàng
        // trong bào này, data được viết từ hàng đầu tiên trong file excel trở xuống,
        // chỉ số tương ứng sẽ là từ 0-> numberOfRow.. -> -1

        for (int i = 0; i < numberOfRowData; i++) {
            XSSFRow row = loginSheet.getRow(i);
            XSSFCell username = row.getCell(0);
            XSSFCell password = row.getCell(1);
            data[i][0] = username.getStringCellValue(); // row i col 1
            data[i][1] = password.getStringCellValue(); // row i col 2
        }
        return data;
    }

    @Test(dataProvider = "excel")
    public void TC01_LoginFirstAccount(String email, String password) throws InterruptedException, IOException {
        //Lấy URL từ properties file và tải trang.

        ////////Mở URL: http://automationpractice.com/index.php
        ////////Quá trình tải trang không vượt quá 15s.
        driver.get(PropertiesFileUtils.getProperty("base_url"));
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //Lấy định danh iconSignin từ properties file và tìm kiếm, click
        LoginPage.setWait(
                PropertiesFileUtils.getProperty("pathIconSignIn"),10,driver);
        WebElement iconSignIn = driver.findElement(By.xpath(
                PropertiesFileUtils.getProperty("pathIconSignIn")));
        boolean visible = iconSignIn.isDisplayed();
        Assert.assertEquals(true,visible,"Not displayed");
//        Thread.sleep(5000);
        LoginPage.setWait(
                PropertiesFileUtils.getProperty("pathIconSignIn"),10,driver);
        WebElement elementIconSignIn = driver.findElement(By.xpath(
                PropertiesFileUtils.getProperty("pathIconSignIn")));
        elementIconSignIn.click();


        LoginPage loginPage = new LoginPage(driver);
        PageFactory.initElements(driver, loginPage);

        //Thực hiện đăng nhập qua loginPage.
//            Thread.sleep(3000);
            LoginPage.enterEmail(email,driver);
//            Thread.sleep(3000);
            LoginPage.enterPassword(password,driver);
//            Thread.sleep(3000);
            LoginPage.clickSignIn(driver);

            //Lấy định danh iconSignout từ properties,
            //  kiểm tra SignOut có hiển thị ko, nếu hiển thị thì click
            LoginPage.setWait(
                    PropertiesFileUtils.getProperty("pathIconSignOut"),10,driver);
            WebElement iconSignOut = driver.findElement(By.xpath(
                    PropertiesFileUtils.getProperty("pathIconSignOut")));
            boolean visible1 = iconSignOut.isDisplayed();
            Assert.assertEquals(true,visible1,"Not displayed");
//            Thread.sleep(5000)
            WebElement elementIconSignOut = driver.findElement(By.xpath(
                    PropertiesFileUtils.getProperty("pathIconSignOut")));
            elementIconSignOut.click();
            Thread.sleep(2000);
    }
    @AfterMethod
    public void takeScreenshotTest(ITestResult result) throws Exception{
        Thread.sleep(1000);
        String email = (String)result.getParameters()[0];
        System.out.println(email);
        int index = email.indexOf("@");
        String name = email.substring(0,index);
        if (ITestResult.FAILURE == result.getStatus()){
            CaptureScreenShot.takeScreenshot(driver, name);
        }
    }
}
