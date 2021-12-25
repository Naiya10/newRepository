package com.homeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
http://syntaxprojects.com/javascript-alert-box-demo.php
handle all alerts one by one
1.simple
2.confirmaton
3.prompt
 */
public class homeWork6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement click = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        click.click();
        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept();
        WebElement click2 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        click2.click();
        Alert alert2 =driver.switchTo().alert();
        alert2.dismiss();
        WebElement prompt = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        prompt.click();
        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("Enter name");
        alert3.accept();
        driver.close();
        driver.quit();


    }
}