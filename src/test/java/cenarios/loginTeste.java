package cenarios;

import endpoints.LoginEndPoint;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;
import org.junit.Test;

public class loginTeste
{
    LoginEndPoint HopeLogin = new LoginEndPoint();

    @Test
    public void testinho()
    {
        Response response = HopeLogin.resquest("eve.holt@reqres.in", "cityslicka");
        response.statusCode();
        System.out.println("Status: " + response.statusCode());
        Assert.assertEquals(200,response.statusCode());
    }
}
