//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class PiguTest {
//
//        private static PiguPrisijungimas prisijungimas;
//        private static PiguMegstamiausi megstamiausi;
//        private static PiguBasePage basePage;
//
//
//
//    @BeforeClass
//
//    public static void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/XPS 15/Downloads/chromedriver_win32/chromedriver.exe");
//        WebDriver driver;
//        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        driver = new ChromeDriver(options);
//        //laukiama, kol visi elementai bus uzkrauti
//        driver.manage().window().maximize();
//        prisijungimas = new PiguPrisijungimas(driver);
//        megstamiausi = new PiguMegstamiausi(driver);
//        basePage = new PiguBasePage(driver);
//    }
//        @Test
//
//        public void registracijaTestas() {
//
//            PiguPrisijungimas.bandomeRegistruotis();
//            PiguPrisijungimas.prisijungtiPrieSvetaines();
//
//        }
//
//        @Test
//
//        public void megstamiausiuKrepselis(){
//            PiguMegstamiausi.megstamiausiProduktai();
//
//        }
//
//        @AfterClass
//        public static void tearDown(){
//            PiguPrisijungimas.driver.quit();
//        }
//

//    }
