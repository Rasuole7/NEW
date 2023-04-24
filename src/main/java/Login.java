import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Login {
    private static WebDriver driver;
    //private final By login = By.id("auth-login-tab");
    public Login(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.rde.lt/");
    }
    public static void loginWindown() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
            WebElement login = driver.findElement(By.id("auth-login-tab"));
            // wait.until(ExpectedConditions.visibilityOfElementLocated(login);
            login.click();
//            Thread.sleep(3000);
//            WebElement gmailIcon = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/div/div/div/a[2]"));
//            gmailIcon.click();
            WebElement email = driver.findElement(By.id("loginEmail"));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(email);
            Thread.sleep(3000);
            email.sendKeys("labaskrabas@lalalallala.lt");
            Thread.sleep(3000);
            WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/div[3]/div/input[2]"));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(pass);
            pass.sendKeys("alalala");
            Thread.sleep(3000);
            WebElement button = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/form/footer/div/button"));
            //wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
        } catch (Exception e) {
            System.out.println("error in login" + e.getMessage());
        }
    }
}