import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Example2Test {
    private Response response;
    private UserInfor user;
    private ResponseBody resBody;
    private JsonPath bodyJson;

    @BeforeClass
    public void init() {
        user = new UserInfor(null, "nam", 24, "Ky su");
        RestAssured.baseURI = "https://reqres.in"; //Setup Base URI
        RestAssured.basePath = "/api/users"; //Setup Base Path
        //create request
        RequestSpecification req = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .body(user);

        //take a post & get response
        response = req.post();
        resBody = response.getBody();
        bodyJson = resBody.jsonPath();

    }
    @Test
    public void T01_StatusCodeTest() {
        //Verify the http response status returned. Check Status Code is 404?
        assertEquals( 404, response.getStatusCode(),"Status Check Failed!");
    }

    @Test
    public void T02_MessageChecked() {
//        xác minh kết quả trả về có trường message hay không
        assertEquals(true, resBody.asString().contains("message"), "Message field check Failed!");
    }
    @Test
    public void T03_verifyOnMessageContainName() {
        String resName = bodyJson.get("message");
        if (null == resName) resName = "";
        assertEquals(true, resName.contains("name"),"Message not contain invalid field!");
    }
    @AfterClass
    public void afterTest() {
        //Reset Values
        RestAssured.baseURI = null; //Setup Base URI
        RestAssured.basePath = null;
    }

}
