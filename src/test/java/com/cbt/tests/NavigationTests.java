package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void choromeDriver(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();

    }

    public static void edgeDriver(){

        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();

    }
    public static void firefoxDriver (){

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
        driver.quit();

    }

    public static void main(String[] args) {

        firefoxDriver();
        edgeDriver();
        choromeDriver();
    }

}

