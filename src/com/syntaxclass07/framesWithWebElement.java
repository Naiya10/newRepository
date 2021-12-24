package com.syntaxclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesWithWebElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        //switch to the desire frame using webelemnt
        WebElement frame1 = driver.findElement(By.xpath("//*[@id='frame1']"));
        driver.switchTo().frame(frame1);
        WebElement wb2 = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
        System.out.println(wb2.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement text2= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text2.getText());




    }
}