package com.syntaxclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleelementsexceptions {
    public static String url = "https://chercher.tech/practice/stale-element";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //locating refresh button
        WebElement refreshBtn = driver.findElement(By.cssSelector("button[id='refresh-button']"));
        // wait for 11 sec
        Thread.sleep(11000);
        refreshBtn = driver.findElement(By.cssSelector("button[id='refresh-button']"));
        //clicking on thatbutton
        refreshBtn.click();


    }
}