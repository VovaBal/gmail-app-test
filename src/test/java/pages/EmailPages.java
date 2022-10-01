package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailPages {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id="android:id/button1")
    WebElement gotItSmartButton;

    public EmailPages(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void gotItSmartButton (){
        driver.findElement(By.id("android:id/button1")).click();

    }
}
