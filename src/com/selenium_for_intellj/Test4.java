package com.selenium_for_intellj;

import org.openqa.selenium.chrome.ChromeDriver;

abstract class Test4 {
    public static void goToFacebook() {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.facebook.com/");
        System.out.println(driver1.getTitle());
        driver1.quit();
    }
}

