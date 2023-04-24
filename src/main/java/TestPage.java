import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class TestPage {
    private static Registracija registracija;
    private static Login login;
    private static WebDriver driver;


    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/XPS 15/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        //laukiama, kol visi elementai bus uzkrauti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //objektas
        registracija = new Registracija(driver);
        login = new Login(driver);
        Registracija.ieiti();
    }
    @Test
    public void registracija2() {

        Registracija.registruotis();
        Registracija.forma();
    }
    @Test
    public void login() {

        Login.loginWindown();
    }
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }
}