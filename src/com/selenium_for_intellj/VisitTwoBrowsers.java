package com.selenium_for_intellj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisitTwoBrowsers {

    static void visitWebsitesDifferentBrowsers(String a, Integer b) throws InterruptedException {

        if (b== 1) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver objX = new ChromeDriver();
            objX.get(a);
        }else {
            //this is to replicate firefox driver
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
            WebDriver objX = new FirefoxDriver();
            objX.get(a);
            Thread.sleep(3000);
            objX.quit();
        }


    }
}
