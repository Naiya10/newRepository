package com.synatxclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ww.google.com");
        // to show the maximize the window
        driver.manage().window().maximize();
        //to show the full screen
        driver.manage().window().fullscreen();

    }
}
