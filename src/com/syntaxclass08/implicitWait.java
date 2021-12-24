package com.syntaxclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement getClick = driver.findElement(By.xpath("//*[@id='save']"));
        getClick.click();
        // get new user Frist name
        WebElement firstName = driver.findElement(By.xpath("//*[@id='First-Name']/p"));
        System.out.println(firstName.getText());


    }
}
