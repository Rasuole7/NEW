import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class KayakBase {
    protected static WebDriver driver; // kitose klasese paveldesime sita driveri

    public KayakBase (WebDriver driver){ // kuriame konstruktoriu su savybemis
        KayakBase.driver = driver; // priskiriame savybe prie naujos reiksmes; nenaudojame this.driver, kad neraudonuotu, parasem klases pavadinimas
        //driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Duration - objektas, ofSeconds - metodai
    }

    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }
}
