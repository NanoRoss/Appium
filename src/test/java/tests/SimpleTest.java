package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Helpers.Helpers;


public class SimpleTest extends BaseClass {


    @Test
    public void sampeTestRosario3() throws InterruptedException {

        Helpers helpers = new Helpers(driver);
        helpers.SleepSeconds(1000);
        driver.get("https://rosario3.com");
        helpers.SleepSeconds(10);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/span[2]")).click();
        helpers.SleepSeconds(1);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
        helpers.SleepSeconds(1);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
        helpers.SleepSeconds(10);
    }


}
