import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Example2Test {
    private Response response;   // lưu response của API
    private ResponseBody resBody; //body của response
    private JsonPath bodyJson;  //body của response đã được convert sang JSON
    String message;
    @BeforeClass
    public void init() {
        message = "User not found!";
        // thiết lập endpoint
        RestAssured.baseURI = "https://reqres.in"; //Setup Base URI
        RestAssured.basePath = "/api/users/"; //Setup Base Path
        RequestSpecification req = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .pathParam("message",message);
        //gọi GET và lấy về response
        response = req.get("/{message}");
        resBody = response.getBody();
        bodyJson = resBody.jsonPath();   // response JSON
    }
    @Test
    public void T01_StatusCodeTest() {
        //Kiểm tra HTTP status có = 404 hay không
        assertEquals(404, response.getStatusCode(), "Status Check Failed!");
    }

    //////xác minh kết quả trả về có trường message hay không
    @Test
    public void T02_MessageChecked1(){
        //Kiểm tra phản hồi có trường message hay không
        assertTrue(resBody.asString().contains("message"),"not have message");
    }
//    @Test
//    public void T02_MessageChecked() {
//        assertEquals(true, resBody.asString().contains("message"), "Message field check Failed!");
//    }
    @Test
    public void T03_MessageEquals() {
        //kiểm tra nội dung message có phải là "User not found!” ?
        String currentmessage =bodyJson.getString("message");
        assertEquals(message, currentmessage, "message is not matched!");
    }
}
