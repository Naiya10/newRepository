package com.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
 Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text
 */
public class homeWork3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
       // List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        for (WebElement l:link){
            String now = l.getText();
            System.out.println(now);
        }


    }
}
