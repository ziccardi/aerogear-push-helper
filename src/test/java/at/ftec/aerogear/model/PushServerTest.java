package at.ftec.aerogear.model;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.net.MalformedURLException;


/**
 * Created by apatecfischelmayer on 26.01.2016.
 */
@Ignore
public class PushServerTest {

    private PushServer pushServer;

    @Test
    public void testUrl() throws MalformedURLException {
        pushServer = new PushServer( "http://test.at:9512/", "http://testother.at:8080/" );
        String url = pushServer.getPushUrl();
        Assert.assertEquals( "http://test.at:9512", url );
        Assert.assertEquals( "http://testother.at:8080", pushServer.getAuthUrl() );
    }

    @Test
    public void tooShortServerUrl() {
        pushServer = new PushServer("abc", "foo");
    }
}