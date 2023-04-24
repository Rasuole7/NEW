//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class PiguPrisijungimas extends PiguBasePage {
//
//
//    static WebDriver driver;
//    private final By profileButton = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)");
//    private final By registrationButton = By.cssSelector(".btn.btn-secondary.btn-full-width[href='https://pigu.lt/lt/users/account#register']");
//    private final By emailas = By.cssSelector("div[class='col-1-of-2 register-details'] input[placeholder='El. paštas']");
//    private final By slaptazodis = By.cssSelector("div[id='passwordContPopup'] input[placeholder='Slaptažodis']");
//    private final By pakartotinisSlaptazodis = By.cssSelector("div[id='passwordContPopup'] input[placeholder='Slaptažodis']");
//    private final By patvirtinimas = By.cssSelector("div[class='icheckbox icheck-item']");
//    private final By registruotis = By.cssSelector("input[value='Registruotis']");
//
//
//    public PiguPrisijungimas(WebDriver driver) {
//        super (driver);
//
//public static void main (String[]args){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/XPS 15/Downloads/chromedriver_win32/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        PiguBasePage piguBasePage = new PiguBasePage(driver);
//
//        public static void bandomeRegistruotis(){
//
//            try {
//
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//                WebElement profilioMygtukas = driver.findElement(profileButton);
//                profilioMygtukas.click();
//                WebElement registracijosMygtukas = driver.findElement(registrationButton);
//                registracijosMygtukas.click();
//                WebElement email = driver.findElement(emailas);
//                email.sendKeys("labaskrabas@ohoho.lt");
//                WebElement password = driver.findElement(slaptazodis);
//                password.sendKeys("hakunamatata5456");
//                WebElement password2 = driver.findElement(pakartotinisSlaptazodis);
//                password2.sendKeys("hakunamatata5456");
//                WebElement agreement = driver.findElement(patvirtinimas);
//                agreement.click();
//                WebElement uzsiregistruoti = driver.findElement(registruotis);
//                uzsiregistruoti.click();
//
//            } catch (Exception e) {
//                System.out.println("error in registration form" + e.getMessage());
//            }
//
//
//            public static void prisijungtiPrieSvetaines (); {
//
//
//                WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//                WebElement profilioMygtukas2 = driver.findElement(By.xpath("//*[@id=\"headeMenu\"]/li[1]/a/i"));
//                profilioMygtukas2.click();
//
//                WebElement email2 = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[3]/input"));
//                email2.sendKeys("labaskrabas@ohoho.lt");
//
//                WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordCont\"]/input"));
//                password.sendKeys("hakunamatata5456");
//
//                WebElement uzsiregistruoti = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div[3]/div[1]/form/div[7]/input"));
//                uzsiregistruoti.click();
//
//            }
//        }
//
//    }
//}