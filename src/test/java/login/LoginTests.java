package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    String emailAddress = "timilehin.oyeniran@vendease.com";
    String password ="P@ssword1";

    @Test
    public void testSuccessfulLogin(){
        loginPage.enterEmail(emailAddress);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //HomePage homePage = loginPage.getLoginAlert();
        //assertEquals(homePage," Login successful ", "Incorrect text alert");
    }
}
