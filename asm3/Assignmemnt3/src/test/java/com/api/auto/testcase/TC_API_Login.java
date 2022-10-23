package com.api.auto.testcase;

import com.api.auto.utils.PropertiesFileUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.requestSpecification;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class
TC_API_Login {
    private final String pathDriver = "D:\\1.tester\\Bai lab\\Automation\\Selenium\\chromedriver.exe";
    private WebDriver driver;
    //    private String account;
    private Response response;
    private ResponseBody responseBody;
    private JsonPath jsonBody;

    @BeforeClass
    public void init() {
        //// Init data
        String baseUrl = PropertiesFileUtils.getProperty("baseurl");
        String loginPath = PropertiesFileUtils.getProperty("loginPath");
        String email = PropertiesFileUtils.getProperty("account");
        String password = PropertiesFileUtils.getProperty("password");
        HashMap<String, Object> account = new HashMap<>();

        account.put("account", email);
        account.put("password", password);
        RequestSpecification request = RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri(baseUrl)
                .body(account);
        response = request.post(loginPath);
        responseBody = response.body();
        System.out.println(responseBody.asString());
        jsonBody = responseBody.jsonPath();
    }

    @Test(priority = 0)
    public void TC01_Validate200Ok() {
        // kiểm chứng status code
        assertEquals(200, response.getStatusCode(), "Status Check Failed!");
    }

    @Test(priority = 1)
    public void TC02_ValidateMessage() {
        // kiểm chứng response body có chứa trường message hay không
        // kiểm chứng trường message có = "Đăng nhập thành công
        assertTrue(responseBody.asString().contains("message"), "message field check Failed!");
    }

    @Test(priority = 2)
    public void TC03_MessageEquals() {
        System.out.println(jsonBody.get("message").toString());
        assertEquals("Đăng nhập thành công", jsonBody.get("message").toString(), "message check failed");
    }

    @Test(priority = 3)
    public void TC04_CheckToken() {
        System.out.println(jsonBody.get("token").toString());
        assertTrue(responseBody.asString().contains("token"), "token field check Failed!");
        PropertiesFileUtils.setProperty("token", jsonBody.get("token").toString());
    }

    @Test(priority = 4)
    public void TC05_CheckUserField() {
        assertTrue(responseBody.asString().contains("user"), "user field check failed");
    }

    @Test(priority = 5)
    public void TC06_CheckContainAccount() {
        assertTrue(jsonBody.get("user").toString().contains("account"), "account field check failed");
    }

    @Test(priority = 6)
    public void TC07_CheckContainPassword() {
        assertTrue(jsonBody.get("user").toString().contains("password"), "password field check failed");
    }

    @Test(priority = 7)
    public void TC08_CheckAccountInUser() {
        System.out.println(jsonBody.get("user.account").toString());
        assertEquals(PropertiesFileUtils.getProperty("account"), jsonBody.get("user.account").toString(), "account failed");
    }

    @Test(priority = 8)
    public void TC09_CheckPasswordInUser() {
        System.out.println(jsonBody.get("user.password").toString());
        assertEquals(PropertiesFileUtils.getProperty("password"), jsonBody.get("user.password").toString(), "password failed");
    }

    @Test(priority = 9)
    public void TC10_CheckTypeInUser() {
        System.out.println(jsonBody.get("user.type").toString());
        assertEquals("UNGVIEN", jsonBody.get("user.type").toString(), "check Type Failed");
    }

}
