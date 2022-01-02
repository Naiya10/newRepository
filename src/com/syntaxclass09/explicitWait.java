package com.syntaxclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://chercher.tech/practice/explicit-wait
public class explicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");

        WebElement element1 = driver.findElement(By.cssSelector("button[id='enable-button']"));
        element1.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='disable']")));
        // print statemnt
        System.out.println(until.isEnabled());


        // locating the button after 10 seconds
       // WebElement element = driver.findElement(By.cssSelector("button[id='disable']"));



    }
}
