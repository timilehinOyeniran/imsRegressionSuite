package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    //Links to the functionalities on the Side Menu Bar
    private By dashboardLink = By.cssSelector("div[ng-reflect-router-link='dashboard']");
    private By users = By.cssSelector("div[ng-reflect-router-link='users']");
    private By warehouse = By.cssSelector("div[ng-reflect-router-link='warehouse']");
    private By auditTrail = By.cssSelector("div[ng-reflect-router-link='audit-trail']");
    private By analytics = By.cssSelector("div[ng-reflect-router-link='analytics']");
    private By generalSetup = By.cssSelector("div[ng-reflect-router-link='setup']");
    private By productPage = By.cssSelector("div[ng-reflect-router-link='product-page']");


    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public DashboardPage clickDashboard(){
        driver.findElement(dashboardLink).click();
        return new DashboardPage(driver);
    }
    public UsersPage clickUsers(){
        driver.findElement(users).click();
        return new UsersPage(driver);
    }
    public WarehousePage clickWarehouse(){
        driver.findElement(warehouse).click();
        return new WarehousePage(driver);
    }
    public AuditTrailPage clickAuditTrail(){
        driver.findElement(auditTrail).click();
        return new AuditTrailPage(driver);
    }
    public AnalyticsPage clickAnalytics(){
        driver.findElement(analytics).click();
        return new AnalyticsPage(driver);
    }
    public GeneralSetupPage clickGeneralSetup(){
        driver.findElement(generalSetup).click();
        return new GeneralSetupPage(driver);
    }
    public ProductSetupPage clickProductPage(){
        driver.findElement(productPage).click();
        return new ProductSetupPage(driver);
    }
    private void getSelectors(String locators){
     driver.findElement(By.cssSelector(locators)).click();
    }
}
