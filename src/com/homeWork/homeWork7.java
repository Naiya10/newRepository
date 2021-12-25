package com.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/*
goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
click on follow on instagram
click on facebook.com
get all windows handles
 */
public class homeWork7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        WebElement insta = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
        insta.click();
        WebElement facebook = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/a"));
        facebook.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());
        driver.quit();



    }
}
