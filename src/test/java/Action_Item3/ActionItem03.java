package Action_Item3;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem03 {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running on background)
        //options.addArguments("headless");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        //driver.manage().windows().maximize();

        //capture the search number and print for following cities using arraylist and for loop
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");
        for(int i = 0; i < countries.size(); i++) {
            //go to bing home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
            //locate the element for search field and type the keywords "iphones'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(countries.get(i));
            //submit on bing search button
            // driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(2500);
            //capture the bing search and print it
            String searchResult=driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //System.out.println("Result is " + searchResult);
            // extract out the number and print the search number onlyString[]arrayResult=searchResult.split(" ");System.out.println("My search result number for country "+countries.get(i)+" is "+arrayResult[2]);
        }//end of for loop

        //quit the driver
        driver.quit();

    }//end of main
}//end of java class

