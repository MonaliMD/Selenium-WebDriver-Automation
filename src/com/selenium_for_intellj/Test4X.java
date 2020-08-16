package com.selenium_for_intellj;

import org.openqa.selenium.chrome.ChromeDriver;

class Test4X extends Test4 {
    public static void goToTrademe() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        ChromeDriver driver2 = new ChromeDriver();
        driver2.get("https://www.trademe.co.nz/");
        System.out.println(driver2.getTitle());
        driver2.quit();
    }



}
