import com.api.auto.utils.PropertiesFileUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.requestSpecification;

public class TC_API_Login {
    private final String pathDriver="D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe";
    private WebDriver driver;
    private String account;
    private String password;
    private Response response;
    private ResponseBody responseBody;
    private JsonPath jsonBody;

    public void init() {
        //// Init data
        String baseUrl ="http://54.179.59.245:5000";
        String loginPath="/api/users/login";
        account ="testerFunix";
        password ="Abc13579";
        RestAssured.baseURI = baseUrl;
        //// make body
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("baseUrl",baseUrl);
        body.put("loginPath",loginPath);
        body.put("acount",account);
        body.put("password",password);
        RequestSpecification request = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(account);
        response = requestSpecification.post(loginPath);
        responseBody = response.body();
        jsonBody = responseBody.jsonPath();
        System.out.println(" " + responseBody.asPrettyString());
    }

    @BeforeClass
    public void callWeb() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void getUrl() {
        driver.get(PropertiesFileUtils.getProperty("base_url"));
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
