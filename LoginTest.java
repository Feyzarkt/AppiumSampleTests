import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    public static AndroidDriver<MobileElement> driver;
    public static WebDriverWait wait;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        setup();
        loginAccount();
    }
  
    public static void setup () throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android SDK built for x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("appPackage", "com.pozitron.hepsiburada");
        cap.setCapability("appActivity", "com.hepsiburada.ui.home.BottomNavigationActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        wait = new WebDriverWait(driver, 10);
    }

    public static void loginAccount(){
        WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.id("account_icon")));
        account.click();
        WebElement userLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("llUserAccountLogin")));
        userLogin.click();
        WebElement loginEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("etLoginEmail")));
        loginEmail.sendKeys("feyzaurkut2@gmail.com");
        WebElement loginPassword = wait.until(ExpectedConditions.elementToBeClickable(By.id("etLoginPassword")));
        loginPassword.sendKeys("hello123");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLoginLogin")));
        loginButton.click();
    }
}