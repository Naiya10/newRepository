package com.homeWork;

import com.sun.glass.ui.Accessible;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the title of page
 */
public class homeWork5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
      /*  for(WebElement link:links){
            String linkAddress = link.getAttribute("href");
            System.out.println(linkAddress);
        }*/
        driver.findElement(By.partialLinkText("Electronics")).click();
        WebElement link = driver.findElement(By.xpath("//*[@id='mainContent']/section[1]/div[2]/a[3]/div[2]"));
        link.click();
        System.out.println(driver.getTitle());



    }
}
