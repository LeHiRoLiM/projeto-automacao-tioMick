package cenarios;

import endpoints.TokenEndPoint;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class BugTeste
{
    TokenEndPoint gloryBug = new TokenEndPoint();

    @Test
    public void bug()
    {
        Response response = gloryBug.resquest("root@local.dev", "root");
        response.statusCode();
        System.out.println("Status: " + response.statusCode());
        Assert.assertEquals(202,response.statusCode());

        String bodyString = response.body().asString();
        System.out.println(bodyString);
        JSONObject obj = new JSONObject(bodyString);

        String token = obj.getString("access_token");
        System.out.println(token);
    }
}

