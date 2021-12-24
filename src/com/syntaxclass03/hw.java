package com.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.findElement(By.id("customer.firstName")).sendKeys("Naiya");
            driver.findElement(By.id("customer.lastName")).sendKeys("kaur");
            driver.findElement(By.id("customer.address.street")).sendKeys("5422 ");
            driver.findElement(By.id("customer.address.city")).sendKeys("richmond ");
            driver.findElement(By.id("customer.address.state")).sendKeys("VA");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("23234 ");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567894");
            driver.findElement(By.id("customer.ssn")).sendKeys("12547825");
            driver.findElement(By.id("customer.username")).sendKeys("12547825");
            driver.findElement(By.id("customer.password")).sendKeys("987654321");
            driver.findElement(By.id("repeatedPassword")).sendKeys("987654321");
            driver.findElement(By.className("button")).click();
            driver.close();




    }
}
