//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;
//
//public class BasePage {
//
//    public static void main(String[] args){
//        //initialize webdriver
//        System.out.println("Initializing chromedriver");
//        // declare path to chromedriver
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XPS 15\\Downloads\\chromedriver_win32");
//        // creating chromedriver object
//        WebDriver driver = new ChromeDriver();
//
//        System.out.println("Initialize complete");
//
//        // navigate to website
//        driver.get("https://pigu.lt");
//
//        // close chrome
//
//        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]"));
//        //searchBox.sendKeys();
//        // searchBox.submit();
//        cookieNotice.click();
//
//        driver.quit();
//
//
//    BasePage test1 = new BasePage();
//    test1.googleSearch();
//    public void googleSearch(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com"); //*[@id="realbox"]
//        driver.quit();
//        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"realbox\"]"); // cia xpath cookie
//        cookieNotice.click();
//
//        String[] searchTerms = {"Java", "Vilnius"};
//        WebElement searchBox;
//        String term;
//        searchBox = driver.findElement(By.xpath("//*[@id=\"realbox\"]"));
////        for (int i = 0; i < searchTerms.length; i++){
////            term = searchTerms[i];
//
//
//        for (String term: searchTerms){
//           // term = searchTerms[i];
//            searchBox.sendKeys(term);
//            searchBox.submit();
//            String expectedValue = term + "- "\Google\" paieška"; //turime lyginti title
//            String actualValue = driver.getTitle();
//            assertEquals(expectedValue, actualValue);
//           // assert // kaip if'as, tikrina, ar reiksmes yra teisingos
//            driver.navigate().back(); // narsykleje griztame atgal
//            driver.quit(); // uzdaro narsykle
//        }
//
//
//            String[] searchTerms = {"Java", "Vilnius"};
//            WebElement searchBox;
//            String term;
//            searchBox = driver.findElement(By.xpath("//*[@id=\"realbox\"]"));
////        for (int i = 0; i < searchTerms.length; i++){
////            term = searchTerms[i];
//
//            for (String term1: searchTerms){
//                // term = searchTerms[i];
//                searchBox.sendKeys(term1);
//                searchBox.submit();
//                String expectedValue = term + "- "\Google\" paieška"; //turime lyginti title
//                String actualValue = driver.getTitle();
//                assertEquals(expectedValue, actualValue);
//                // assert // kaip if'as, tikrina, ar reiksmes yra teisingos
//                driver.navigate().back(); // narsykleje griztame atgal
//                driver.quit(); // uzdaro narsykle
//            }
//
//    }
//}
//}