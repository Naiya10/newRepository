package com.syntaxclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("meetcaur1090@gmail.com");
        //driver.findElement(By.name("email")).sendKeys("meetcaur1090@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Jattavejatta1");
     // driver.findElement(By.name("login")).click();
      //  driver.findElement(By.linkText("Forgot Password?")).click();
      driver.findElement(By.partialLinkText("Forgot")).click();
      driver.quit();


    }
}
