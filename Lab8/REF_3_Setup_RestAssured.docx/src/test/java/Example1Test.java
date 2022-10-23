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
import static org.testng.Assert.assertTrue;


public class Example1Test {
    private Response response;   // lưu response của API
    private UserInfor user;       // thông tin request body
    private ResponseBody resBody; //body của response
    private JsonPath bodyJson;  //body của response đã được convert sang JSON

    @BeforeClass
    public void init(){
        //Tạo body mẫu
        user = new UserInfor("Tai","Nam",28,"IT");
        // thiết lập endpoint
        RestAssured.baseURI = "https://reqres.in"; //Setup Base URI
        RestAssured.basePath = "/api/users"; //Setup Base Path

        //tạo request
        RequestSpecification req = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .body(user);

        //gọi POST và lấy về response
        response = req.post();
        resBody = response.getBody();
        bodyJson = resBody.jsonPath();
    }
    @Test
    public void T01_StatusCodeTest() {
        //Kiểm tra HTTP status có = 201 hay không
        assertEquals(201, response.getStatusCode(), "Status Check Failed!");
    }

    @Test
    public void T02_IdChecked() {
        //Kiểm tra phản hồi có trường id hay không
        assertTrue(resBody.asString().contains("id"), "id field check Failed!");
    }

    @Test
    public void T03_CreatedAtChecked() {
        //Kiểm tra phản hồi có chứa trường createAt hay không
        assertTrue(resBody.asString().contains("createdAt"), "createdAt field check Failed!");
    }


    @Test
    public void T04_verifyOnMatchingName() {
        //Kiểm tra phản hồi tên có giống với request body không
        String resName = bodyJson.get("name");
        assertEquals(user.getName(), resName, "Name is not matched!");
    }

    @Test
    public void T05_verifyOnMatchingGender() {
        //Kiểm tra phản hồi giới tính có giống với request body không
        String resGender = bodyJson.get("gender");
        assertEquals(user.getGender(), resGender, "Gender is not matched!");
    }

    @Test
    public void T06_verifyOnMatchingAge() {
        //Kiểm tra phản hồi tuổi có giống với request body không
        int resAge = bodyJson.getInt("age");
        assertEquals(user.getAge(), resAge, "Age is not matched!");
    }

    @Test
    public void T07_verifyOnMatchingJob() {
        //Kiểm tra phản hồi công việc có giống với request body không
        String resJob = bodyJson.get("job");
        assertEquals(user.getJob(), resJob,"Job is not matched!");
    }

    @AfterClass
    public void afterTest() {
        //kết thức test hiện tại thì clear enpoint để chạy tiếp test liền sau trong test Suite
        // ( có ý nghĩa nếu test sau không sử dụng chung enpoint với test hiện tại)
        //vd test1.java : http://abc.com  ,  test2.java: https://xyz.com
        RestAssured.baseURI = null; //Setup Base URI
        RestAssured.basePath = null;
    }
}
