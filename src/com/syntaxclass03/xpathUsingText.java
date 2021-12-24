package com.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
       // driver.manage().window().maximize();
        WebElement alertLink= driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertLink.click();
       // Thread.sleep(2000);

    }
}