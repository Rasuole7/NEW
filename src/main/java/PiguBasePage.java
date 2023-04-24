import org.openqa.selenium.WebDriver;

public class PiguBasePage {


      protected WebDriver driver;


        public PiguBasePage (WebDriver driver){
            this.driver = driver;
            driver.get("https://pigu.lt");


            }


        }



