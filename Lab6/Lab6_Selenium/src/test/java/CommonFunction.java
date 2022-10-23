import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunction {
    public static boolean isExist(WebDriver driver, String xpath) {
        boolean result = false;
        try {
            driver.findElement(By.xpath(xpath));
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
