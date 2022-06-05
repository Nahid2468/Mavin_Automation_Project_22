package Day7_042322;

import Day6_042322.WebElement_Mortgagecalc;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_mortgagecalc {
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

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //select start month from the dropdown
        WebElement_Mortgagecalc startMonth = (WebElement_Mortgagecalc) driver.findElement(By.xpath("//*[@name='param[start-month]"));
        //define select command
        //select dropdown = new Select(startMonth);
        //select by visible text
        //dropdown.selectByVisibleText("Jun");

        //clicking on dropdown and its value if the dropdown tag is not under select tag
        startMonth.click();
        //click on the value of the start month
        driver.findElement(By.xpath("//*[text()='Jun']")).click();

        //select Loan Type from the dropdown
        WebElement_Mortgagecalc loanType = (WebElement_Mortgagecalc) driver.findElement(By.xpath("//*[@name='param[milserve]"));
        //define select command
        Select loanTypeDropdown = new Select(loanType);
        //select by visible text
        loanTypeDropdown.selectByVisibleText("FHA");

    }//end of main
}//end of java class
