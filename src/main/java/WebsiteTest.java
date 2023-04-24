import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class WebsiteTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/XPS 15/Downloads/chromedriver_win32/chromedriver.exe"); //declare path to
        // chromedriver
        WebsiteTest test1= new WebsiteTest();
        test1.googleSearch();
    }
    public void googleSearch(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        cookieNotice.click();
        String[] searchTerm = {"Java", "Vilnius", "Kaunas"};
        WebElement searchBox;
        searchBox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        for(String term : searchTerm){
            searchBox.sendKeys(term);
            searchBox.submit();
            String expectedValue = term + " - „Google“ paieška";
            String actualValue = driver.getTitle();
            assertEquals(expectedValue, actualValue);
            driver.navigate().back();
        }
        //*[@id="APjFqb"]
        driver.quit();

        //Uzduotis
//        public void websiteSearch(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://www.rde.lt/");
//            WebElement cookieNotice = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
//            cookieNotice.click();
//            String[] wishlist = {"dviratis", "telefonas", "televizorius". "laikrodis", "fotoaparatas"};
//            WebElement searchBox;
//            searchBox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
//            for(String i : wishlist){
//                WebElement searchBox = driver.findElement(By.xpath("/html/head/title"));
//                searchBox.sendKeys(i);
//                searchBox.submit();
//
//
//                List<WebElement> productTitles = driver.findElements(By.xpath("/*[@id=\"main_container_wrapper\"])"/);
//                        String[] products = new String[productTitles.size()];
//                        for (int x = 0; x < productTitles.size(); x++) {
//                            products[x] = productTitles.get(x).getText();
//                            System.out.println();
//                        }
//
//                System.out.println("Rasti produktai su zodziu:\"" + products + i + "\":");
//                        for (String product : products){
//                            System.out.println(" - " + product);
//                        }
//
//                        }
//
//                driver.navigate().back();
//            }
//            //*[@id="APjFqb"]
//            driver.quit();
    }
}