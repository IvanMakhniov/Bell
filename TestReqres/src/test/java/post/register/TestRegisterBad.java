package post.register;

import data.post.register.RequestRegister;
import data.post.register.ResponseRegister;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRegisterBad {
    @Test
    public void testRegisterBad(){
        RequestRegister register = new RequestRegister("sydney@fife");
        ResponseRegister registerBad = given()
                .contentType("application/json")
                .body(register)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400)
                .extract().as(ResponseRegister.class);
    }
}
