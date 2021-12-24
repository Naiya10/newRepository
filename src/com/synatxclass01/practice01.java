package com.synatxclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");
        String title = driver.getTitle();
        System.out.println("The current tittle of the page is : "+ title);
        driver.close();
    }
}
