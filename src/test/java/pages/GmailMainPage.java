package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GmailMainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private WebElement gotItButton;
    @FindBy(id = "com.google.android.gm:id/action_done")
    private WebElement takeToButton;
    @FindBy(id = "com.google.android.gm:id/dismiss_button")
    private WebElement closeMeetingButton;
    @FindBy(id = "com.google.android.gm:id/dismiss_button")
    private WebElement composeButton;

    public GmailMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickInGotInButton() {
        driver.findElement(By.id("com.google.android.gm:id/welcome_tour_got_it")).click();

    }

    public void takeToButton() {
        driver.findElement(By.id("com.google.android.gm:id/action_done")).click();

    }

    public void closeMeetingButton() {
        driver.findElement(By.id("com.google.android.gm:id/dismiss_button")).click();

    }

    public void composeButton() {
        driver.findElement(By.id("com.google.android.gm:id/compose_button")).click();


    }
}
