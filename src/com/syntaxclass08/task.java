package com.syntaxclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement start = driver.findElement(By.xpath("//*[@id='startButton']"));
        start.click();
        WebElement text = driver.findElement(By.xpath("//*[@id='finish']/h4"));
        Thread.sleep(5000);
        System.out.println(text.getText());

    }
}