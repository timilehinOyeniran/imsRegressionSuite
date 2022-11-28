package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private WebDriver driver;
    private By emailField = By.cssSelector("input[data-ims-testid='email']");
    private By passwordField = By.cssSelector("input[data-ims-testid='password']");
    private By loginButton = By.cssSelector("button[data-ims-testid='login-button']");

    //Constructor for thr login page to access the web driver
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public HomePage clickLogin(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
    public HomePage getLoginAlert(){
        var alert = driver.switchTo().alert().getText();
        System.out.println(alert);
        return new HomePage(driver);
    }
}
