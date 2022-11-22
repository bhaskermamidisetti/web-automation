package com.sauceDemoSite.base;

import com.sauceDemoSite.utils.ConfigUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractSteps {
    public static WebDriver driver;
    private String WEB_DRIVER = "webdriver.gecko.driver";

    public WebDriver getDriver() throws InterruptedException {
        System.setProperty(WEB_DRIVER, ConfigUtils.getDriverPath());
        System.out.println(ConfigUtils.getDriverPath());
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(ConfigUtils.getBaseURL());
        Thread.sleep(5000);
        return driver;
    }

}