import org.openqa.selenium.WebDriver;

public class HomePage extends Base{



public HomePage(WebDriver driver) {
    super(driver);

}


public void goTo(){
    driver.get("https://rde.lt");

}
}
