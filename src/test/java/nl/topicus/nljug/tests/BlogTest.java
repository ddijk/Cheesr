package nl.topicus.nljug.tests;

import java.net.URL;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import nl.topicus.nljug.pageobjects.GIndex;

@RunWith(Arquillian.class)
public class BlogTest {

    @Drone
    private WebDriver browser;

    @ArquillianResource
    private URL baseUrl;

    @Test
    public void testTagCloud(@InitialPage GIndex homePage) {
        // Add your test code here...
    }
}
