package com.sauceDemoSite.stepDefinitions;

import com.sauceDemoSite.base.AbstractSteps;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.sauceDemoSite.pageclass.ProductPageObjects.*;

public class ProductPage extends AbstractSteps {

    @And("^Add three items to the basket$")
    public void addThreeItemsToTheBasket() throws InterruptedException {
        driver.findElement(By.xpath(backPack)).click();
        Thread.sleep(10);
        driver.findElement(By.xpath(bikeLight)).click();
        Thread.sleep(10);
        driver.findElement(By.xpath(tshirt)).click();

    }


    @And("^Buy only (\\d+) items$")
    public void buyOnlyItems(int arg0) throws InterruptedException {
        driver.findElement(By.xpath(shoppingCart)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(removeBackPack)).click();
        driver.findElement(By.xpath(checkout)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(checkoutFirstName)).sendKeys("bhas");
        driver.findElement(By.xpath(checkoutLastName)).sendKeys("Mamidisetti");
        driver.findElement(By.xpath(postalCode)).sendKeys("cr27ke");
        driver.findElement(By.xpath(continueButton)).click();
        WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[7]"));
        System.out.println("total order is - " +ele.getText());
        driver.findElement(By.xpath(finishButton)).click();

    }

    @And("^make an order between \\$(\\d+)-\\$(\\d+)  and print the order$")
    public void makeAnOrderBetween$$AndPrintTheOrder(int arg0, int arg1) throws InterruptedException {
        driver.findElement(By.xpath(backPack)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(tshirt)).click();
        driver.findElement(By.xpath(shoppingCart)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(removeBackPack)).click();
        driver.findElement(By.xpath(checkout)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(checkoutFirstName)).sendKeys("bhas");
        driver.findElement(By.xpath(checkoutLastName)).sendKeys("Mamidisetti");
        driver.findElement(By.xpath(postalCode)).sendKeys("cr27ke");
        driver.findElement(By.xpath(continueButton)).click();
        WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[7]"));
        System.out.println("total order is - " +ele.getText());
        driver.findElement(By.xpath(finishButton)).click();
    }
}
