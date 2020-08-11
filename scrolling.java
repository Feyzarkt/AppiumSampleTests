
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrolling extends base{
    
    public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver<AndroidElement> driver=capabilities();
        WebDriverWait wait = new WebDriverWait(driver, 10);
       
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.FrameLayout[2]").click();
        WebElement menu =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc='bottomNavigationItem_1']")));
        menu.click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Kitap, Müzik, Film, Hobi\"));");
       	     
	}
    
}
