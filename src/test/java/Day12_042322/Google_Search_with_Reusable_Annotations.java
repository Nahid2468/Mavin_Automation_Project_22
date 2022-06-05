package Day12_042322;

import ReusableClasses.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import static ReusableClasses.Reusable_Annotations_Class.driver;
import static ReusableClasses.Reusable_Annotations_Class.logger;

public class Google_Search_with_Reusable_Annotations {

    //test case 1: navigate to google and enter a keyword on search field
    @Test(priority = 1)
    public void GoogleSearchKeyword() {
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='q']", "BMW", logger, "Search Field");
        //submit the go button
        Reusable_Actions_Loggers.submitAction(driver, "//*[@name='btnk']", logger, "Google Search Button");
    }//end of test 1

    /*
    dependsOnMethods is used when following @Test is dependent on previous @Test method. If the first test fails,
    the dependent test will get skipped
    */
    @Test(dependsOnMethods = "GoogleSearchForKeyword")
    public void GoogleCaptureSearchNumber() {
        //capture search result
        String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@id='result-stats']", logger, "Search Result Text");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO, "Search number is " + arrayResult[1]);
    }//end of test 2
}//end of class

