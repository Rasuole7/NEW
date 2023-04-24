import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PirkiniuKrepselis {

    private WebDriver driver;
    private final By addToCart = By.xpath("/html/body/main/div[3]/div[2]/div/ul[1]/li[1]/a");


    public PirkiniuKrepselis (WebDriver driver){ // argumentas su kintamaisiais
        this.driver = driver;
        driver.get("https://rde.lt");

    }



    public void addToCart(){
      WebElement addToCartProduct = driver.findElement(By.xpath("/html/body/main/div[3]/div[2]/div/ul[1]/li[1]/a"));
     addToCartProduct.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // laukiame, kol atsiras objektas tinklalapyje // laikas, kiek lauksi, kol tinklalapyje atsiras objektas
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/header/div/div/a")));
        WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        addProduct.click();

    }


    public void cookies(){
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
        cookies.click();
    }

    public void prompter(){
        WebElement prompter = driver.findElement(By.xpath("//*[@id=\"LP-79004w4\"]/div[2]/div/div[4]/button"));
        prompter.click();

    }

}
