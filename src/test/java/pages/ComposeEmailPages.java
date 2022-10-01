package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComposeEmailPages {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget." +
            "RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.EditText")
    private WebElement emailAdressField;

    @FindBy(id = "com.google.android.gm:id/peoplekit_listview_flattened_row")
    private WebElement emailClick;


    public ComposeEmailPages(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void emailClick() {
        driver.findElement(By.id("com.google.android.gm:id/peoplekit_listview_flattened_row")).click();

    }

    public void emailAdressField() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget." +
                "RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.EditText")).sendKeys("balasevolodimir@gmail.com");
           }
}

