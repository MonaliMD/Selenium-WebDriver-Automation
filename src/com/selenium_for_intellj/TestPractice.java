package com.selenium_for_intellj;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestPractice {
    public void testFunction() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
        }
    }
