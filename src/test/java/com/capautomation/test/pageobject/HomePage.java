package com.capautomation.test.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.capautomation.test.config.BrowserConfig.driver;

/**
 * Created by NarenNavya on 29/11/2017.
 */
public class HomePage {

    public WebElement login()
    {
        Assert.assertEquals(driver.findElement(By.className("navbar-brand")).getText(),"Hotel Management Platform");
        return  driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)"));
    }

    public WebElement hotelName()
    {
        driver.findElement(By.id("hotelname")).clear();
        return driver.findElement(By.id("hotelname"));
    }

    public WebElement address()
    {
        driver.findElement(By.id("address")).clear();
        return driver.findElement(By.id("address"));
    }

    public WebElement owner()
    {
        driver.findElement(By.id("owner")).clear();
        return driver.findElement(By.id("owner"));
    }

    public WebElement phoneNumber()
    {
        driver.findElement(By.id("phone")).clear();
        return driver.findElement(By.id("phone"));
    }

    public WebElement email()
    {
        driver.findElement(By.id("email")).clear();
        return driver.findElement(By.id("email"));
    }

    public void displayCreateButton()
    {
        Assert.assertTrue(driver.findElement(By.id("createHotel")).isDisplayed());
    }

    public WebElement createButton()
    {
        return driver.findElement(By.id("createhotel"));
    }

    public String deleteIcon()
    {
       WebElement delete =  driver.findElement(By.cssSelector(".glyphicon"));
        delete.getAttribute("id");
        delete.click();
        return String.valueOf(delete);
    }

    public String entryDisplayed()
    {
        WebElement entry = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]"));
        entry.getAttribute("class");
        entry.getText();
        Assert.assertTrue(entry.isDisplayed());
        return String.valueOf(entry);
    }

}
