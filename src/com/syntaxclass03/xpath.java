package com.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        WebElement createNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button'"));
        createNewAccount.click();
        Thread.sleep(2000);
    }
}
