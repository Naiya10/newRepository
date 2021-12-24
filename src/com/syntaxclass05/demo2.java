package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //navigate to website fill the username
        /*
        deletethe username
        add new user name and tester it
         */
      WebElement username = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
      // send in the text AOn
        username.sendKeys("AON");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        username.sendKeys("Tester");



    }
}
