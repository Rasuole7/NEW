import org.checkerframework.checker.units.qual.C;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KayakTest extends KayakBase {
    private KayakHome kayakHome;     // kuriam prieiga prie metodu

    public KayakTest() { // tuscias konstruktorius be jokiu argumentu

        super(driver);
    }


    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/XPS 15/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();

    }

    @Test
    public void KayakStayTest(){
      KayakBase.goTo();
      KayakHome.stays();

    }

//   @AfterClass
//    public static void tearDown(){
//    driver.quit();
//    }

}

