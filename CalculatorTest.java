import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


public class CalculatorTest {
 
    
    public static void main(String[] args) throws MalformedURLException {
        
        DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability("deviceName", "Android SDK built for x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("appPackage", "com.android2.calculator3");
        cap.setCapability("appActivity", "com.xlythe.calculator.material.Theme.Orange");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        
        MobileElement el1 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_5");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_3");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_9");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
        
       // System.out.println(driver.findElementById("com.android2.calculator3:id/eq").getText());
        
       /* if (driver.findElementById("com.android2.calculator3:id/eq").getText().equalsIgnoreCase("64")) {
            System.out.println("equalssssssssss");
        }*/
       
        Assert.assertEquals(driver.findElementByAccessibilityId("equals").getText(), "64");
    
    
    
}
}
