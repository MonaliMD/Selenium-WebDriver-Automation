package com.selenium_for_intellj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Write your test
        System.out.println("Hello");

        //Set driver properties
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //WebDriver obj = new ChromeDriver();
        //obj.get("https://www.google.com/");

        //visitWebsites("https://www.facebook.com/");
        //visitWebsites("https://www.futirium.com/");

        //Calling "visitWebsitesDifferentBrowsers" methods from "VisitTwoBrowsers" class
       VisitTwoBrowsers.visitWebsitesDifferentBrowsers("https://www.facebook.com/", 1);
       VisitTwoBrowsers.visitWebsitesDifferentBrowsers("https://www.futirium.com/", 2);

        //Calling "testFunction" methods from "TestPractice" class
       //TestPractice.testFunction();

        //Calling "testFunction" methods from "TestPractice" class
        TestPractice  object1 = new TestPractice();
        object1.testFunction();

        //Calling "goToGoogle" methods from "Test2" class
        Test2.goToGoogle();

        //Calling "goToYahoo" methods from "Test2" class
        Test2 object2 = new Test2();
        object2.goToYahoo();

        //Calling "goToYahooGoogle" methods from "Test3" class
        //Test3 object3 = new Test3();
        //object3.goToYahooGoogle();


        //Calling "goToFbTrademe" methods from "Test3" class
        Test3 object4 = new Test3();
        object4.goToFbTrademe();

    }

//    public static void visitWebsites(String a) {
//        ChromeDriver objX = new ChromeDriver();
//        objX.get(a);
//    }


}
