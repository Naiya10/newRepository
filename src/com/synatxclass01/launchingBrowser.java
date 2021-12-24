package com.synatxclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // calling a method
        driver.get("http://www.google.com");
        String url =driver.getCurrentUrl();
        System.out.println("The curent url loaded in brower is: "+ url);
// returns the tittle of the current page in the browser
      String title = driver.getTitle();
      System.out.println("The current tittle of the page is : "+ title);
      // closethe browser
        driver.quit();


    }
}
