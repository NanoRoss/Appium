package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Helpers.Helpers;

import java.io.File;
import java.net.URL;

public class BaseClass {


    public AndroidDriver driver;
    public WebDriverWait wait;



    @BeforeTest
    public void Setup() {


        //relative path to apk file
        final File classpathRoot = new File(System.getProperty("user.dir"));
        final File appDir = new File(classpathRoot, "src\\test\\resources\\apps");
        final File app = new File(appDir, "rappi.apk");

        try {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_XL_API_30");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

            //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

            caps.setCapability("appPackage","com.grability.rappi");
            caps.setCapability("appActivity","com.rappi.login.activities.SignInEntryActivity");

            //initializing driver object
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url,caps);

            //initializing explicit wait object
            wait = new WebDriverWait(driver, 30);


        }catch (Exception exp) {
            System.out.println("Cause is:" +exp.getCause());
            System.out.println("Massage is:" +exp.getMessage());
            exp.printStackTrace();
        }

    }


    @AfterTest
    public void teardown(){
        driver.quit();
    }



}
