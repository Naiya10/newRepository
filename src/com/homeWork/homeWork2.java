package com.homeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser (edited)
 */
public class homeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.findElement(By.cssSelector("input[value='Back']")).click();
        driver.get("https://www.facebook.com/signup");
        //Thread.sleep(5000);
        WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("unknown");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("abcd");
        WebElement ph = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        ph.sendKeys("12411212");
        WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
        password.sendKeys("12124545120");
        WebElement month = driver.findElement(By.cssSelector("#month"));
        Select select = new Select(month);
        select.selectByVisibleText("Sep");
        WebElement date = driver.findElement(By.cssSelector("#day"));
        Select select2 = new Select(date);
        select2.selectByValue("10");
        WebElement year = driver.findElement(By.cssSelector("#year"));
        Select select3 = new Select(year);
        select3.selectByVisibleText("1990");
        WebElement click = driver.findElement(By.cssSelector("input[value='1']"));
        click.click();
        WebElement signup = driver.findElement(By.xpath("//*[@name='websubmit']"));
        signup.click();
        Thread.sleep(1000);
        driver.close();




    }
}
