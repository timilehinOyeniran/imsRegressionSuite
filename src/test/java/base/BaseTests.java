package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ims-staging.vendease.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        loginPage =new LoginPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
