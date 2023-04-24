import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PiguMegstamiausi extends PiguBasePage {


    public PiguMegstamiausi (WebDriver driver){
        super(driver);
    }



    public void megstamiausiProduktai(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pirmasProduktas = driver.findElement(By.xpath("//*[@id=\"productBlock47928228\"]/div/div/div[3]/a/img"));
        pirmasProduktas.click();

        WebElement pridetiPirmaProdukta = driver.findElement(By.xpath("//*[@id=\"product-sidebar\"]/div[1]/div[4]/div/div[1]/span"));
        pridetiPirmaProdukta.click();

        WebElement antrasProduktas = driver.findElement(By.xpath("//*[@id=\"productBlock1262648\"]/div/div/div[3]/a/img"));
        antrasProduktas.click();

        WebElement pridetiAntraProdukta = driver.findElement(By.xpath("//*[@id=\"product-sidebar\"]/div[1]/div[5]/div/div[1]/span"));
        pridetiAntraProdukta.click();
    }

}
