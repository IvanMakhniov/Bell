package get.listResource;

import data.get.listResours.reqres.ResponseResource;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class TestListResource {
    @Test
    public void testListResource(){
        ResponseResource resource = given()
                .when()
                .get("https://reqres.in/api/unknown")
                .then()
                .statusCode(200)
                .extract().body().as(ResponseResource.class);
        for (int i = 1; i < resource.getData().size(); i++){
            Assert.assertTrue(resource.getData().get(i).getYear() > resource.getData().get(i - 1).getYear());
        }
    }
}
