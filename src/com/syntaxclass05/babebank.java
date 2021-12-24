package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class babebank {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wellsfargo.com");
        WebElement userName= driver.findElement(By.xpath("//*[@id=\"userid\"]"));
      userName.sendKeys("Gabrieljoe");
      WebElement pasword = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/div[1]/form/div[2]/input"));
      pasword.sendKeys("Bigsloth1990");
    driver.findElement(By.xpath("//*[@id=\"btnSignon\"]")).click();
    WebElement us = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
        //us.sendKeys("Gabrieljoe");
       // WebElement p = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));

     //  p.sendKeys("Bigsloth1990");





    }
}
