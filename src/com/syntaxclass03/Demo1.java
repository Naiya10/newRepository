package com.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;////input[@id='user-message']
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement clickOn= driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        clickOn.click();
        Thread.sleep(2000);
       WebElement click2= driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']"));
       click2.click();
        WebElement click3 = driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']"));
        click3.click();


    }


}
