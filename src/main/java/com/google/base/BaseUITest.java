package com.google.base;

import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class BaseUITest {

    public WebDriver driver;
    private final Logger LOGGER = Logger.getLogger(getClass());

    @BeforeMethod
    public void setUp() {
        //create driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");
        WebDriver driver = new ChromeDriver(options);
        setWebDriver(driver);
        Configuration.timeout=8000;

        //open google.com
        String url = "https://www.google.com/";
        open(url);

        //close terms and conditions
        $(By.id("L2AGLb")).click();
        LOGGER.info("Tests started");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        clearBrowserCache();
        getWebDriver().quit();
        LOGGER.info("Tests finished");

    }
}
