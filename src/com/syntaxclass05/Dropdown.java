package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
           WebElement days = driver.findElement(By.xpath("//*[@id='select-demo']"));

            // use the select class to select from drop down
       // Select the value by drop down using dropdown
        Select select = new Select(days);
        /*select.selectByIndex(1);
        Thread.sleep(2000);

        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(7);*/
        // Select by visible text
        select.selectByVisibleText("Saturday");

        // select by value
        select.selectByValue("Wednesday");



    }
}
