package Day10_042322;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static ReusableLibraries.Reusable_Actions.*;

public class testng_Example {

    //declare the local driver outside so that it can be reusable with annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = setDriver();
    }//end of before suite annotation

    //test case 1: navigate google and enter a keyword on search field
    @Test(priority = 1)
    public void searchForKeyword() {
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
       Reusable_Actions.sendKeysAction(driver,"//*[@name='q'])", "BMW", "search Field");
        //submit the go button
        Reusable_Actions.submitAction(driver, "//*[@name='btnK']", "Google Search Button");
    }//end of test 1

    @Test(priority = 2)
    public void captureSearchNumber() {
        //capture search result
        String result = Reusable_Actions.getTextAction(driver, "//*[@id='result-stats']");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSession() {

        driver.quit();
    }//end of after suite
}

