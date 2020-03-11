package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titles = new ArrayList<>();
        List<Boolean> startWith = new ArrayList<>();


        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            titles.add(driver.getTitle());
            startWith.add(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.comi"));
        }
        if (titles.get(0).equalsIgnoreCase(titles.get(1)) && titles.get(0).equalsIgnoreCase(titles.get(1))) {
            System.out.println("ALL THREE TITLES ARE SAME");
        } else {
            System.out.println("ALL THREE TITLES ARE NOT SAME");
        }

        if(startWith.get(0).booleanValue()==startWith.get(1).booleanValue()&& startWith.get(0).booleanValue()==startWith.get(2).booleanValue()){
            System.out.println("All three starts with http://practice.cybertekschool.com ");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}