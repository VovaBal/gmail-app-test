package gmail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.ComposeEmailPages;
import pages.EmailPages;
import pages.GmailMainPage;

import java.net.MalformedURLException;
import java.net.URL;

public class GmailApplicationTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Pixel 2 API 26");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.google.android.gm");
        capabilities.setCapability("appActivity", "com.google.android.gm.GmailActivity");
        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    public void testEmail() throws Exception {
        GmailMainPage mainPage = new GmailMainPage(driver);
        EmailPages emailPages = new EmailPages(driver);
        ComposeEmailPages composeEmailPages = new ComposeEmailPages(driver);

        Thread.sleep(1000);

        mainPage.clickInGotInButton();
        Thread.sleep(1000);

        mainPage.takeToButton();
        Thread.sleep(1000);

        mainPage.closeMeetingButton();
        Thread.sleep(1000);

        mainPage.composeButton();

        Thread.sleep(1000);

        emailPages.gotItSmartButton();

    }
}
