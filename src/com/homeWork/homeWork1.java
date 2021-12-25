package com.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */
public class homeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("Naiya");
        driver.findElement(By.cssSelector("input[id='customer.lastName']")).sendKeys("kaur");
        driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("adress");
        driver.findElement(By.cssSelector("input[id='customer.address.city']")).sendKeys("Springfield");
        driver.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("VA");
        driver.findElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys("2210");
        driver.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("12345785412");
        driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("124545");
        driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("naiya123");
        driver.findElement(By.cssSelector("input[id='customer.password']")).sendKeys("12458741cd");
        driver.findElement(By.cssSelector("input[id='repeatedPassword']")).sendKeys("12458741cd");
        driver.findElement(By.cssSelector("input[class='button']")).click();
        Thread.sleep(5000);
        driver.quit();











    }
}
