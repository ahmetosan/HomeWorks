package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://www.wayfair.com/", "https://www.walmart.com,", "https://www.westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titles = new ArrayList<>();
        List<String> url = new ArrayList<>();

        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            url.add(urls.get(i));
            titles.add(driver.getTitle().replace(" ", "").toLowerCase());
            if (url.get(i).contains(titles.get(i))) {
                System.out.println("test passed for " + url.get(i));
            } else {
                System.out.println("test failed for " + url.get(i));
            }
        }


        System.out.println(Arrays.asList(titles));
        System.out.println(Arrays.asList(url));
    }
}