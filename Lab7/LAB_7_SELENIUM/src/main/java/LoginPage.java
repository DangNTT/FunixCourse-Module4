import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
        public static  void enterEmail(String email,WebDriver chrome) throws InterruptedException {
            ExplicitWait.setWait(
                    "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input",5,chrome);
            WebElement elementEmail = chrome.findElement(By.xpath(
                    "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
            elementEmail.click();
            elementEmail.sendKeys(email);
        }

        public static void enterPassword(String password,WebDriver chrome) throws InterruptedException {
            ExplicitWait.setWait(
                    "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input",3,chrome);
            WebElement enterPassword=chrome.findElement(By.xpath(
                    "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
            enterPassword.click();
            enterPassword.sendKeys(password);
        }
    public static void clickSignIn(WebDriver chrome) throws InterruptedException {
        ExplicitWait.setWait(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span",5,chrome);
        WebElement clickSignIn= chrome.findElement(By.xpath(
                "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
        clickSignIn.click();
    }

}
