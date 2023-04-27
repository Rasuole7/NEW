import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class KayakHome extends KayakBase {

    private static final By stayButton = By.cssSelector("a[aria-label='Search for hotels']");
//    private static final By searchBoxField = By.cssSelector(".k_my-mod-theme-mcfly-search > input:nth-child(2)");

//    private static final By searchButton = By.cssSelector("button[aria-label='Search']");
    private static final By seeAllButton = By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div/div/section[2]/div/header/div/div[2]/a");

    public KayakHome(WebDriver driver) { //konstruktorius

        super(driver);
    }


    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement stay = stayButtonWait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stay.click();
//            WebElement searchCityStay = driver.findElement(searchBoxField);
//            searchCityStay.click();
//            String hotelTitle = "Narutis Hotel";
//            searchCityStay.sendKeys(hotelTitle);
//            WebElement searchButtonClick = driver.findElement(searchButton);
//            searchButtonClick.click();

        } catch (Exception e) {
            System.out.println("Stay button is not displayed"); // jei elementas stay nerodomas, isprintins sita zinute
        }
        WebDriverWait seeAllButtonWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            WebElement seeAll = seeAllButtonWait.until(ExpectedConditions.visibilityOfElementLocated(seeAllButton));
            seeAll.click();
        //            WebElement seeAllButton = driver.findElement(By.cssSelector("a[aria-label='Click here for more information about Stays near Vilnius'] div[class='Iqt3-button-content']"));
        } catch (Exception e) {
            System.out.println("See All button is not displayed"); // jei elementas stay nerodomas, isprintins sita zinute
        }
    }

//    public static void searchB() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            WebElement searchBox = driver.findElement(searchBoxField);
//            searchBox.click();
//            searchBox.sendKeys("Narutis");
//            searchBox.submit();
//        } catch (Exception e) {
//            System.out.println("Search field not found");
//        }
//        try{
//        WebDriverWait searchBoxWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement search = searchBox.findElement(searchBoxField););
//        search.click();
//        search.sendKeys("Narutis");
//
//    } catch (Exception e){
//            System.out.println("Cannot input a search word");
//        }


    }

