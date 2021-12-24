package com.syntaxclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        // enable the alert
        driver.findElement(By.cssSelector("button#alert")).click();

        // switch the focus of selenium
       Alert simpleAlert= driver.switchTo().alert();
       simpleAlert.accept();
       // handling confirmation alert
        // switch the focus

        // prompt alert
        driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();

        // switch focus
        Alert promptAlert = driver.switchTo().alert();
        // send keys
        promptAlert.sendKeys("hello");
        promptAlert.accept();



    }
}
