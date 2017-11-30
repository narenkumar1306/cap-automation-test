package com.capautomation.test.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.capautomation.test.config.BrowserConfig.driver;

/**
 * Created by NarenNavya on 29/11/2017.
 */
public class LoginPage {
    public WebElement username()
    {
        driver.findElement(By.id("username")).clear();
        return driver.findElement(By.id("username"));
    }
    public WebElement password()
    {
        driver.findElement(By.id("password")).clear();
        return driver.findElement(By.id("password"));
    }
    public WebElement loginButton()
    {
        return driver.findElement(By.id("doLogin"));
    }
}
