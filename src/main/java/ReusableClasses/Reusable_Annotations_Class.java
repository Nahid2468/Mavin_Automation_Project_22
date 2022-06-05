package ReusableClasses;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;


public class Reusable_Annotations_Class {

    //set all global variables here with public static
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    //set Before suite for report path and set driver

    public void SetChromeDriver(Reusable_Actions_Loggers Reusable_Actions_loggers){
        driver = Reusable_Actions_loggers.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html", true);
    }//end of before suite annotation




}//end of class
