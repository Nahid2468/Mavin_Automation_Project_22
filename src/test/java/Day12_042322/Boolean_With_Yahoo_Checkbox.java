package Day12_042322;

import ReusableClasses.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static ReusableClasses.Reusable_Annotations_Class.driver;
import static ReusableClasses.Reusable_Annotations_Class.logger;

public class Boolean_With_Yahoo_Checkbox {

    @Test
    public void Yahoo_Stay_Signed_In_Checkbox_Verification() {
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on sign in
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='sign in']", logger, "sign In");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        if (elementState == true) {
            logger.log(LogStatus.PASS, "checkbox is selected as expected");
        } else {
            logger.log(LogStatus.FAIL, "checkbox is not selected");
        }
    }//end of test

}//end of class

