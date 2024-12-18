package cenarios;

import endpoints.ReqresinEndPoint;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class loginTeste
{
    ReqresinEndPoint hopeLogin = new ReqresinEndPoint();

    @Test
    public void testinho()
    {
        Response response = hopeLogin.resquest("eve.holt@reqres.in", "cityslicka");
        response.statusCode();
        System.out.println("Status: " + response.statusCode());
        Assert.assertEquals(200,response.statusCode());

        String bodyString = response.body().asString();
        System.out.println(bodyString);
        JSONObject obj = new JSONObject(bodyString);

        String token = obj.getString("token");
        System.out.println(token);
    }
}
