package com.project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object

    private Driver() {
    }

    /*
    we make the webDriver private beceuse we want to close access from outside of the class
    we are making it static because we will use it in a static method
     */
   // private static WebDriver driver;//default value =null
    private  static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

    /*
    create a re-usable utility  method which will return the same  driver instance once we call it
    - ıf an instance doesn't exist it will create first and then it will always return same instance

     */

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {

            /*
            we will read our browser type configuration.properties file
            this way we can control which browser is opened from outside our code
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            depending on the browserType returned from the configuration.properties
            switch statement will determine the case and open the matching browser
             */

            switch (browserType) {
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

        }

        return driverPool.get();
    }

    /*
    create a new Driver.closeDriver(); it will use .quit() method to quit browsers and then set the
    driver value back to null

    */

    public static void closeDriver() {
        if (driverPool.get() != null) {
            /*
            this line will terminate the currently existing driver completely it will not exist going forword
             */
            driverPool.get().quit();
            /*
            we assign the value back to null so that my "singleton" can create a newer one if needed
             */
            driverPool.remove();//bu aslında driver=null
        }

    }




}
