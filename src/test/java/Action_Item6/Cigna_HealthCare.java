package Action_Item6;

import ReusableClasses.Reusable_Actions_Loggers;
import ReusableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.elementName;


public class Cigna_HealthCare {

    //declare the local driver outside so that it can be reusable with other annotation methods

    WebDriver driver;

    ExtentReports reports;

    ExtentTest logger;
    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }//end of before suite annotation

    //test case 1: navigate to cigna and capture the Title
    @Test(priority = 1)
    public void captureTitle() {
        driver.navigate().to("https://www.cigna.com");
        //capture Title
        String capture = Reusable_Actions.getTextAction(driver,"//*[@title= 'Cigna Official Site  | Global Health Service Company']");
        //print the header for Affordable Health Insurance Plans
        String Result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class= 'display']",logger,"Affordable Health Insurance Plans");
        //print header
        System.out.println("The header title reads " + Result);
    }//end of test 1

    @Test(priority = 2)
    public void actualTitle(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS, "Successfully verified page element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to verify page element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to verify the page element " + elementName + " " + e);
    }//end of test 2

        //test case 2: mouse hover to Individuals and Families and click on it
        @Test(priority = 1)
        public void HoverMouse() {
            //Mouse Hover to Individuals and Families
            Reusable_Actions.mouseHover(driver, "//*[@id='individuals-families-level-one-link']");
            //click on Health insurance for Individuals and Families
            Reusable_Actions.clickAction(driver, "//*[href='/individuals-families/plans-services/health-insurance-plans/index.html']");
        }//end of test 3

        @Test(priority = 2)
        public void printHeader() {
            //print header for Shop For Your Own Coverage
            String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='menu-header']",logger,"Shop for Your Own Coverage");
            //print header
            System.out.println("The header title reads " + result);
        }//end of test 4

        //test case 3: click the scroll bar and hover down to Health plans by state
        @Test(priority = 1)
        public void clickScrollBar() {
            //click on the Scroll Bar
            Reusable_Actions.clickAction(driver, "//*[@class='js-focus-visible']");
            //Mouse Hover to Health plans by state
            Reusable_Actions.mouseHover(driver, "//*[@class='scroll-promo-visdq promo-blue edge-promo']");
        }//end of test 5

        @Test(priority = 2)
        // print header for Health plans by state
        String Result = Reusable_Actions.getTextAction(driver, "//*[@class='subhead-2']");
        //print header
        System.out.println("The header title reads " + Result);
    }//end of test 6

    //test case 4: click on the 'select by state' dropdown box to view list of 50 states
    @Test(priority = 7)
    public void clickOnBox () {
        //click on the dropdown box
        Reusable_Actions.clickAction(driver, "//*[@id= 'landing-state-chooser']");
        //select a state
        Reusable_Actions.selectAction(driver, "//*[@name= 'landing-state-chooser']");
    }//end of test 7

    @Test(priority = 8)
    public void click () {
        //click on 'select a country'
        Reusable_Actions.clickAction(driver, "//*[@id= 'landing-county-chooser']");
        //select a country
        Reusable_Actions.selectAction(driver, "//*[@name= 'landing-county-chooser']");
        //click see plans Button
        Reusable_Actions.clickAction(driver, "//*[@class= 'btn btn-primary']");
    }//end of test 8

    //test case 5: click on “marketplace plan levels and features ”right arrow to view plan levels and premium cost.
    @Test(priority = 1)
    public void clickOnArrow(){
        //click on the arrow
        Reusable_Actions.clickAction(driver,"//*[@class= 'control-arrow right']");



    @AfterSuite
    public void quitSession () {

        driver.quit();
    }//end of after suite

}







    }
