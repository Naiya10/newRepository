package com.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */
public class homeWork4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement element = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        element.sendKeys("admin");
        WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("");
        WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
        login.click();
        Thread.sleep(1000);
        WebElement text = driver.findElement(By.cssSelector("#spanMessage"));
        System.out.println(text.getText());


    }
}
