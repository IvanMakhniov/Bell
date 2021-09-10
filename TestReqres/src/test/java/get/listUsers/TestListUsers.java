package get.listUsers;

import data.get.listUsers.reqres.Response;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestListUsers {

    @Test
    public void testListUsers(){
        Response response = given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .extract().body().as(Response.class);
        Assert.assertTrue(response.getData().stream().allMatch(x -> x.getAvatar().contains(response.getData().get(0).getAvatar())),
                "Имена файлов аватаров пользователей не совпадают");
    }
}
