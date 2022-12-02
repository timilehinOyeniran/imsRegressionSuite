package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WarehousePage{
    private WebDriver driver;
    //protected HomePage homePage;
    private By addWarehouseButton= By.cssSelector("button[data-ims-testid='add-warehouse-button']");
    private  By warehouseForm = By.cssSelector("");
    //private By businessNameField =By.cssSelector("input[data-ims-testid='businessName']");
    private By warehouseNameField = By.cssSelector("input[data-ims-testid='name']");
    private By managerField= By.cssSelector("input[data-ims-testid='manager']");
    private By searchWarehouseList = By.cssSelector("button[data-ims-testid='search-button']");
    private By addressField = By.cssSelector("input[data-ims-testid='address']");
    private By countryDropdown = By.cssSelector("[data-ims-testid='country_id']");
    private By stateDropdown =By.cssSelector("[data-ims-testid='state_id']");
    private By cityDropdown= By.cssSelector("[data-ims-testid='city_id']");
    private By proceedButton = By.cssSelector("button[data-ims-testid='proceed-button']");
    private By clearButton = By.cssSelector("button[data-ims-testid='clear-button']");



    public WarehousePage(WebDriver driver){
        this.driver=driver;
    }
    public HomePage clickWarehouseMenu(){
        HomePage homePage = new HomePage(driver);
        homePage.clickWarehouse();
        return new HomePage(driver);
    }
    public void clickAddWarehouse(){
        driver.findElement(addWarehouseButton).click();
    }
    public void enterWarehouseName(String warehouseName){
        driver.findElement(warehouseNameField).sendKeys(warehouseName);
    }
    public void enterManagerName(String managerName){
        driver.findElement(managerField).sendKeys(managerName);
        Select dropdown = new Select(driver.findElement(managerField));
        dropdown.selectByVisibleText(managerName);
    }
    public void selectCountry(String country){
        driver.findElement(countryDropdown).click();
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(country);
    }
    public void selectState(String state){
        driver.findElement(stateDropdown).click();
        Select select = new Select(driver.findElement(stateDropdown));
        select.selectByVisibleText(state);
    }
    public void selectCity(String city){
        driver.findElement(cityDropdown).click();
        Select select = new Select(driver.findElement(cityDropdown));
        select.selectByVisibleText(city);
    }
    public void enterAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void submitForm(){
        driver.findElement(proceedButton).click();
    }
}
