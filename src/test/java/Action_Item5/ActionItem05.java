package Action_Item5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem05 {
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

        //navigate to UHC
        driver.navigate().to("https://www.uhc.com");
        Thread.sleep(3000);

        // verify the title
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = "Health insurance plans for individuals &amp; families, employers, medicare | UnitedHealthcare";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("pass : The uhc url is opened successful");
        } else {
            System.out.println("Fail : The uhc url is not opened successfully");
        }

        //create an ArrayList and iterate at least three times for three different values
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("tom");
        firstName.add("alex");
        firstName.add("Charlie");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Flynn");
        lastName.add("Warren");
        lastName.add("Torres");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("Jan");
        birthMonth.add("March");
        birthMonth.add("May");

        ArrayList<String> birthday = new ArrayList<>();
        birthday.add("Jan 16");
        birthday.add("March 24");
        birthday.add("May 20");

        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1989");
        birthYear.add("1992");
        birthYear.add("1993");

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10453");
        zipCode.add("10003");
        zipCode.add("10128");

        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("1223456");
        memberId.add("2234667");
        memberId.add("3355779");

        //click on Find a Doctor
        try {
            WebElement FindDoctor = driver.findElement(By.xpath("//*[@href='/find-a-doctor']"));
            FindDoctor.click();
        } catch (Exception e) {
            //print out the exception
            System.out.println("unable to to click on Find Doctor " + e);
        }//end of Find Doctor exception

        //click on sign in
        try {
            WebElement signinButton = driver.findElement(By.xpath("//span[@class= 'mr-4']"));
            signinButton.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            //print out the exception
            System.out.println("unable to click on sign in " + e);
        }//end of sign in exception

        //click on Medicare plan
        try {
            driver.findElement(By.xpath("//[@aria-label = 'Medicare plans Medicare plans  Opens a new window']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            //print out the exception
            System.out.println("unable to click on Medicare plan " + e);
        }//end of Medicare plan exception

        //switch to new tab by calling ArrayList
        ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab2.get(1));
        driver.close();
        driver.switchTo().window(tab2.get(0));









    }
//    driver.quit

   }//end of main

