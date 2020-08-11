
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adding extends base{
    public static void main(String[] args) throws MalformedURLException {
       
    
    AndroidDriver<AndroidElement> driver=capabilities();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//android.widget.TextView[@text='25 milyon ürün içinde ara']")).click();
    WebElement loginPassword = wait.until(ExpectedConditions.elementToBeClickable(By.id("etACBSearchBox")));
    loginPassword.sendKeys("nike");
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]").click();   
    driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Nike Star Runner 2 Günlük Spor Ayakkabı Gs Siyah\"]")).click();
    driver.findElementByXPath("//android.widget.TextView[@text = 'Sepete Ekle']").click();
    driver.findElementByXPath("//android.widget.ImageView[@content-desc = 'Kapat']").click();
    driver.findElementByXPath("//android.widget.TextView[@text = 'Sepete Ekle']").click();
    driver.findElementById("leftIcon").click();
    WebElement sepet = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc = 'bottomNavigationItem_2']")));
    sepet.click(); 

    
}
}
