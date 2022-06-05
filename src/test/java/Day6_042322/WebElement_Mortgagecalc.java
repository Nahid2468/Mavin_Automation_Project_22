package Day6_042322;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class WebElement_Mortgagecalc implements org.openqa.selenium.WebElement {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //click, clear and enter new value on Home value field
        WebElement_Mortgagecalc homeValue = (WebElement_Mortgagecalc) driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        //Thread.sleep(1500);
    }//end of main
}//end of java class









