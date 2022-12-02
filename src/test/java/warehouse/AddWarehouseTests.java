package warehouse;

import base.BaseTests;
import login.LoginTests;
import org.testng.annotations.Test;
import pages.WarehousePage;

public class AddWarehouseTests extends LoginTests {
    public WarehousePage warehousePage;
    LoginTests loginTests = new LoginTests();
    @Test
    public void createWarehouse(){
        loginTests.testSuccessfulLogin();
        warehousePage.clickWarehouseMenu();
        warehousePage.clickAddWarehouse();
        warehousePage.enterWarehouseName("Automation TestWarehouse");
        warehousePage.enterManagerName("Timilehin Oyeniran");
        warehousePage.selectCountry("NIGERIA");
        warehousePage.selectState("Lagos");
        warehousePage.selectCity("Ikeja");
        warehousePage.enterAddress("12, Automation Avenue Lagos");
        warehousePage.submitForm();

    }
}
