package com.sauceDemoSite.stepDefinitions;

import com.sauceDemoSite.base.AbstractSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sauceDemoSite.pageclass.LoginPageObjects.*;


public class LoginPage extends AbstractSteps {


    @When("^Enter email and password$")
    public void enterEmailAndPassword() throws InterruptedException {
        driver.findElement(By.xpath(userName)).sendKeys("standard_user");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(password)));
        driver.findElement(By.xpath(password)).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.xpath(login)).click();
        Thread.sleep(3000);

    }

    @Given("^Launch the saucedemo web site$")
    public void launchTheYahooWebSite() throws InterruptedException {
            getDriver();
        Thread.sleep(4000);

    }

    @And("^Verify user has successfully login to product page$")
    public void verifyUserHasSucessfullyLoged() throws InterruptedException {;
        driver.getPageSource().contains("Products");
        System.out.println("Successfully Logged in to product page");
    }

    @And("^Log out from the account$")
    public void logOutFromTheAccount() {
       driver.findElement(By.xpath(burgerMenu)).click();
       driver.findElement(By.xpath(logOut)).click();


    }
}