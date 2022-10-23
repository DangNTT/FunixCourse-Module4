package com.api.auto.testcase;

import com.api.auto.utils.PropertiesFileUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TC_API_CreateWork {
    private String token;
    private Response response;
    private ResponseBody responseBody;
    private JsonPath jsonBody;
    //Chúng ta có thể tự tạo data
    private String myWork;
    private String myExperience;
    private String myEducation;

    @BeforeClass
    public void init() {
        // Init data
        String baseUri = "http://54.179.59.245:5000";
        String createWorkPath = "/api/work-user/createWork-user";
        String token = PropertiesFileUtils.getToken();
        HashMap<String, Object> object = new HashMap<String, Object>();
        myWork = "IT";
        myExperience = "1 year";
        myEducation = "Dai hoc";
        object.put("nameWork", myWork);
        object.put("experience", myExperience);
        object.put("education", myEducation);

        RequestSpecification request = RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri(baseUri)
                .header("token", token)
                .body(object);
        response = (Response) request.post(createWorkPath);
        responseBody = response.body();
        jsonBody = responseBody.jsonPath();
        System.out.println(responseBody.asPrettyString());
    }

    @Test(priority = 0)
    //Đảm bảo tạo thành công và nhận về  HTTP status code 201 Created
    public void TC01_CheckStatuscod() {
        Assert.assertEquals(201, response.getStatusCode(), "Not complete");
    }

    @Test(priority = 1)
    //Đảm bảo response trả về có chứa trường id - định danh công việc
    public void TC02_CheckFielId() {
        Assert.assertTrue(responseBody.asString().contains("id"), "Not have fiel id");
    }

    @Test(priority = 2)
    // kiểm chứng tên công việc nhận được có giống lúc tạo
    public void TC03_CheckFielMyWork() {
        Assert.assertEquals(myWork, jsonBody.get("nameWork"), "Not equals myWork");
    }

    @Test(priority = 3)
    // kiểm chứng kinh nghiệm nhận được có giống lúc tạo
    public void TC04_CheckFielExperience() {
        Assert.assertEquals(myExperience, jsonBody.get("experience"), "not equals myExperience");
    }

    @Test(priority = 4)
    // kiểm chứng học vấn nhận được có giống lúc tạo
    public void TC05_CheckFileEducation() {
        Assert.assertEquals(myEducation, jsonBody.get("education"), "not equals myEducation");
    }
}
