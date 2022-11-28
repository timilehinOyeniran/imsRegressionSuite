package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WarehousePage {
    private WebDriver driver;
    private By addWarehouseButton= By.cssSelector("button[data-ims-testid='add-warehouse-button']");


    public WarehousePage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAddWarehouse(){
        driver.findElement(addWarehouseButton).click();
    }
}
