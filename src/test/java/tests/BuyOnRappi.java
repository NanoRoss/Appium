package tests;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.Page.page_BuyOnRappi;

public class BuyOnRappi extends BaseClass {

    @Test
    public void BuyBurguer() throws InterruptedException {

        Helpers helpers = new Helpers(driver);
        helpers.SleepSeconds(5);
        pages.Page.page_BuyOnRappi BuyOnRappi = new page_BuyOnRappi(driver);

        driver.findElement(BuyOnRappi.SelectArgentina_ico).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.Alreadyhaveanaccount_btn).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.LoginWithphone).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.SendNumberforLogin).sendKeys("2364553738"); //id:   editText_phone
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.SendCodeWhatsapp).click();
        helpers.SleepSeconds(25);

        driver.findElement(BuyOnRappi.SelectRestauranteOprtionOnMenu).click();
        helpers.SleepSeconds(15);

        driver.findElement(BuyOnRappi.ConfirMyAdress).click();
        helpers.SleepSeconds(15);


        driver.findElement(BuyOnRappi.SelectBurguersOption).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.SelectMacDonalls).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.SelectPromoMac).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.AddPromoToCart).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.OpenProductsOnCarts).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.ConfirmCart).click();
        helpers.SleepSeconds(5);

        driver.findElement(BuyOnRappi.FinishThepurchase).click();
        helpers.SleepSeconds(500);









    }

}
