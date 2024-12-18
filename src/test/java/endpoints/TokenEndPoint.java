package endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TokenEndPoint
{
    String path = "/token";

    public Response resquest(String email, String password)
    {
        RestAssured.baseURI = "http://bug-api.dev.hill";
        String payload = "{\n" +
                "    \"email\": \"" + email + "\",\n" +
                "    \"password\": \"" + password + "\"\n" +
                "}";
        return RestAssured.given()
                .header("Content-Type","application/json")
                .body(payload)
                .post(path);
    }
}
