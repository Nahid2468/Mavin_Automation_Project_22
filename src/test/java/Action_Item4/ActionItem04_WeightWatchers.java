package Action_Item4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem04_WeightWatchers {
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

        //navigate to Weight Watcher
        driver.navigate().to("https://www.weightwatchers.com/");
        Thread.sleep(3000);

        //create an ArrayList to store three different real zipcodes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("10453");
        zipCodes.add("10003");
        zipCodes.add("10128");
        for (int i = 0; i < zipCodes.size(); i++) {
            //click on Find a Workshop
            try {
                WebElement FindWkshp = driver.findElement(By.xpath("//*span[text() = 'find-a-Workshop']"));
                FindWkshp.click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to to click on Find Workshop " + e);
            }//end of Find Workshop exception

            //click on studio
            try {
                WebElement studioButton = driver.findElement(By.xpath("//span[text() = 'studio']"));
                studioButton.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to click on studio");
            }//end of studio exception

            //clear and enter zipcode
            try {
                WebElement zipSearch = driver.findElement(By.xpath("//*[@id = 'location-search']"));
                zipSearch.clear();
                zipSearch.sendKeys("10453");
                zipSearch.sendKeys(zipCodes.get(i));
                Thread.sleep(1000);
            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to clear and enter zipcode " + e);
            }//end of clear and enter zipcode exception

            //click on search arrow
            try {
                WebElement searchArrow = driver.findElement(By.xpath("//*[@id = 'location-search-cta']"));
                searchArrow.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to click on search arrow " + e);
            }//end of click on search arrow exception

            //and click on studio link
            try {
               ArrayList<WebElement> searchResults = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'linkContainer-1Nqm']")));
               if(i == 0){
                   searchResults.get(1).click();
               }
               else if(i == 1){
                   searchResults.get(2).click();
               } else if (i == 2){
                   searchResults.get(0).click();
               }

            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to get list of studios " + e);
            }

              //print studio address
              try {
                  String studioAddress = driver.findElement(By.xpath("//*[@class= 'address-2pzwW']")).getText();
                  Thread.sleep(1000);
                  System.out.println("The address for the studio is " + studioAddress);
              } catch (Exception e) {
                  //print out teh exception
                  System.out.println("unable to print studio address" + e);
              }//end of click on search arrow exception

              //scroll to the studio schedule
              try {
                  JavascriptExecutor jse = (JavascriptExecutor) driver;
                  jse.executeScript("scroll(0,400)");
              } catch (Exception e) {
                  //print out the exception
                  System.out.println("unable to to scroll" + e);
              }//end of scroll to the studio exception

            //print studio schedule
            try {
                String studioSchedule = driver.findElement(By.xpath("//*[@class = 'scheduleContainerMobile-1rfmF']")).getText();
                Thread.sleep(1000);
                System.out.println("The schedule for the studio is " + studioSchedule);
            } catch (Exception e) {
                //print out the exception
                System.out.println("unable to print studio schedule" + e);
            }//end of print studio schedule exception
        }
//        driver.quit();
    }//end of main
}//end of java class
