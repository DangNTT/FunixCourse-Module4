package com.automation.pom;

import com.automation.utils.PropertiesFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        // TODO Auto-generated constructor stub
        wait = new WebDriverWait(driver, 30);
    }
    public static void setWait(String xpath, int time, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public static  void enterEmail(String email,WebDriver driver) throws InterruptedException {
        LoginPage.setWait(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input",10,driver);
        WebElement elementEmail = driver.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
        elementEmail.click();
        elementEmail.sendKeys(email);
    }
    public static void enterPassword(String password,WebDriver driver) throws InterruptedException {
        LoginPage.setWait(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input",10,driver);
        WebElement enterPassword=driver.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
        enterPassword.click();
        enterPassword.sendKeys(password);
        Thread.sleep(3000);
    }
    public static void clickSignIn(WebDriver driver) throws InterruptedException {
        LoginPage.setWait(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button",10,driver);
        WebElement clickSignIn= driver.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
        clickSignIn.click();
    }


}
