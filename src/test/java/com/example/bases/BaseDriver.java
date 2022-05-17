package com.example.bases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    protected static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
