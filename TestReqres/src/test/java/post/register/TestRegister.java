package post.register;

import data.post.register.RequestRegister;
import data.post.register.ResponseRegister;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRegister {

    @Test
    public void testRegister(){
        RequestRegister register = new RequestRegister("eve.holt@reqres.in", "HackerMan12");
        ResponseRegister registerOk = given()
                .contentType("application/json")
                .body(register)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(200)
                .extract().as(ResponseRegister.class);
    }
}
