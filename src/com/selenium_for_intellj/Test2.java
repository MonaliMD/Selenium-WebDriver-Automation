package com.selenium_for_intellj;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {

    public static void goToGoogle(){
        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com/");
        System.out.println(driver1.getTitle());
        driver1.quit();
    }

    public void goToYahoo(){

        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        ChromeDriver driver2 = new ChromeDriver();
        driver2.get("https://nz.yahoo.com/");
        System.out.println(driver2.getTitle());
        driver2.quit();
    }
}
