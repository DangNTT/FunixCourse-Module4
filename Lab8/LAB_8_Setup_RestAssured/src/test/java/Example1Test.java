import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Example1Test {
    private Response response;   // lưu response của API
    private ResponseBody resBody; //body của response
    private JsonPath bodyJson;  //body của response đã được convert sang JSON
    int userId;
    @BeforeClass
    public void init() {
        //
        userId =2 ;
        // thiết lập endpoint
        RestAssured.baseURI ="https://reqres.in"; //Setup Base URI
        RestAssured.basePath ="/api/users/"; //Setup Base Path

        //tạo request
//        RequestSpecification req = RestAssured.given()
//                .baseUri("https://reqres.in")
//                .when()
//                .get("/api/users/"+userId)
//
//
//        //gọi GET và lấy về response
//        response = req.get("/{userId}");
//        resBody = response.getBody();
//        bodyJson = resBody.jsonPath();   // response JSON
        RequestSpecification req = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .pathParam("userId", userId);

        //gọi GET và lấy về response
        response = req.get("/{userId}");
        resBody = response.getBody();
        bodyJson = resBody.jsonPath();   // response JSON
    }
    @Test
    public void T01_StatusCodeTest() {
        //Kiểm tra HTTP status có = 200 hay không
        assertEquals(200, response.getStatusCode(), "Status Check Failed!");
    }
    @Test
    public void T02_IdChecked(){
        //Kiểm tra phản hồi có trường id hay không
        assertTrue(resBody.asString().contains("id"),"not have id");
    }
    @Test
    public void T03_EmailChecked(){
        //Kiểm tra phản hồi có trường email hay không
        assertTrue(resBody.asString().contains("email"),"not have email");
    }
    @Test
    public void T04_First_NameChecked(){
        //Kiểm tra phản hồi có trường first_name hay không
        assertTrue(resBody.asString().contains("first_name"),"not have first_name");
    }
    @Test
    public void T05_Last_NameChecked(){
        //Kiểm tra phản hồi có trường last_name  hay không
        assertTrue(resBody.asString().contains("last_name"),"not have last_name");
    }
    @Test
    public void T06_AvatarChecked(){
        //Kiểm tra phản hồi có trường avatar  hay không
        assertTrue(resBody.asString().contains("avatar"),"not have avatar");
    }
    @Test
    public void T07_UserIdEquals() {
        //Kiểm tra trường id có giống với user Id hay không
//        int currentUserId =Integer.parseInt(bodyJson.getString("data.id"));
        int currentUserId =bodyJson.getInt("data.id");
        assertEquals(userId, currentUserId, "id is not matched!");
    }















//    @Test
//    public void getdata(){
//        response=RestAssured.get("https://reqres.in/api/users/2");
//        System.out.println("Status code: " + response.getStatusCode());
//        Assert.assertEquals(response.getStatusCode(), 200,"Status not success");
//        System.out.println("All headers  " + response.getHeaders());
//        String headerValue = response.getHeader("Content-Type");
//        System.out.println(headerValue);
//        Assert.assertEquals(headerValue, "application/json; charset=utf-8","header not success");
//        // display body
//        System.out.println(response.asPrettyString());
//        String actualUserName = response.jsonPath().getString("data.email");
//        System.out.println(actualUserName);
//    }
}
