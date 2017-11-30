package com.capautomation.test.steps;
import com.capautomation.test.config.BrowserConfig;
import com.capautomation.test.pageobject.Pages;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.capautomation.test.config.BrowserConfig.driver;

/**
 * Created by NarenNavya on 29/11/2017.
 */
public class CreateSteps {

    Pages pages;
    BrowserConfig browserConfig;

    public CreateSteps (BrowserConfig browserConfig,Pages pages)
    {
        this.pages = pages;
        this.browserConfig = browserConfig;
    }
    @Given("^a browser is at hotel management platform \"([^\"]*)\"$")
    public void aBrowserIsAtHotelManagementPlatform(String url)
    {
        browserConfig.openBrowser("firefox");
        driver.get(url);
    }

    @And("^clicks on the login menu$")
    public void clicksOnTheLoginMenu()
    {
        pages.home().login().click();
    }

    @And("^enters the username as \"([^\"]*)\" and password ad \"([^\"]*)\"$")
    public void entersTheUsernameAsAndPasswordAd(String username, String password)
    {
        pages.login().username().sendKeys(username);
        pages.login().password().sendKeys(password);
    }

    @When("^I clicks on the login button$")
    public void iClicksOnTheLoginButton()
    {
        pages.login().loginButton().click();
    }

    @Then("^I should see create button on the home page$")
    public void iShouldSeeCreateButtonOnTheHomePage()
    {
        pages.home().displayCreateButton();
    }

    @And("^enters hotel name as \"([^\"]*)\"$")
    public void entersHotelNameAs(String hotelName)
    {
        pages.home().hotelName().sendKeys(hotelName);
    }

    @And("^enters address as \"([^\"]*)\"$")
    public void entersAddressAs(String address)
    {
         pages.home().address().sendKeys(address);
    }

    @And("^enters owner as \"([^\"]*)\"$")
    public void entersOwnerAs(String owner)
    {
       pages.home().owner().sendKeys(owner);
    }

    @And("^enters phone number as \"([^\"]*)\"$")
    public void entersPhoneNumberAs(String phoneNumber)
    {
         pages.home().phoneNumber().sendKeys(phoneNumber);
    }

    @And("^enters email as \"([^\"]*)\"$")
    public void entersEmailAs(String email)
    {
        pages.home().email().sendKeys(email);
    }

    @When("^I clicks on the create button$")
    public void iClicksOnTheCreateButton()
    {
        pages.home().createButton().click();
    }

    @Then("^I should see an entry is created$")
    public void iShouldSeeAnEntryIsCreated()
    {
        pages.home().entryDisplayed();
    }

    @When("^I click on deleteIcon$")
    public void iClickOnDeleteIcon()
    {
      pages.home().deleteIcon();
    }

    @Then("^I should see entry is deleted$")
    public void iShouldSeeEntryIsDeleted()
    {

    }

    @And("^enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void entersAnd(String hotelname, String address, String owner , String phonenumber, String email)
    {
        pages.home().hotelName().sendKeys(hotelname);
        pages.home().address().sendKeys(address);
        pages.home().owner().sendKeys(owner);
        pages.home().phoneNumber().sendKeys(phonenumber);
        pages.home().email().sendKeys(email);
        pages.home().createButton().click();
    }
    @After
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
