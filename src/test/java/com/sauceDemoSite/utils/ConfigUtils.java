package com.sauceDemoSite.utils;

public class ConfigUtils {

    private static final String BASE_URL = "https://www.saucedemo.com/";
    private static final String DRIVER_PATH = "src/test/resources/driver/geckodriver.exe/";

    public static String getBaseURL() {
        return BASE_URL;
    }

    public static String getDriverPath() {
        return DRIVER_PATH;
    }
}