import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {

    private static final By stayButton = By.cssSelector("a[aria-label='Search for hotels']");

    public KayakHome(WebDriver driver) { //konstruktorius
        super(driver);
    }




    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement stay = stayButtonWait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stay.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Stay button is not displayed"); // jei elementas stay nerodomas, isprintins sita zinute
        }

    }

}