package com.capautomation.test.config;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by NarenNavya on 29/11/2017.
 */
public class BrowserConfig {

    public static WebDriver driver;

    @Before
    public  void openBrowser(String browserType)
    {
        if(browserType.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
            driver = new FirefoxDriver();
        } else
        {
            throw new IllegalArgumentException("Unknown Browser Driver" + browserType);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
