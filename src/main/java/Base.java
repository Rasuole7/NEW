import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected WebDriver driver;

    public Base (WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }


}
