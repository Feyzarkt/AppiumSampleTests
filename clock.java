
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class clock {
    
     public static AndroidDriver<MobileElement> driver;
    

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        setup();
        clock();
    }
    
    public static void setup () throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android SDK built for x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("appPackage", "com.google.android.deskclock");
        cap.setCapability("appActivity", "com.android.deskclock.DeskClock");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    public static void clock(){
     
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("//xk[@content-desc=\"Alarm\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"9:00 AM\"]").click();
	driver.findElementByXPath("//*[@content-desc='9']").click();
        
	TouchAction t=new TouchAction(driver);
	
	WebElement first=driver.findElementByXPath("//*[@content-desc='0']");
	WebElement second=driver.findElementByXPath("//*[@content-desc='30']");
	

t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
      driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
    }
}
