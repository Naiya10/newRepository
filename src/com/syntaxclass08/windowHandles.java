package com.syntaxclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        //drive.manage().window().maximize()
       //open an new tab or window
        WebElement tab = driver.findElement(By.xpath("//*[@id='tabButton']"));
        // need to find new window
        WebElement window = driver.findElement(By.xpath("//*[@id='windowButton']"));
        // click on new tab and window button
        tab.click();
        window.click();
        //print th handle of the main page or home oage or parent page
        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);
        //now we know that selenium is at home page
        //now need to switch the focus where ever we wanna go
        // first  we need to get all handles
        Set<String> windowHandles = driver.getWindowHandles();
        //2. find the desire handle  i.e newtab??
        //how we do that by iterator
        Iterator<String> it = windowHandles.iterator();
        //itersting over each handle to see if this is desire onr
        while(it.hasNext()){
            String handler = it.next();
            // now need to switch to current page
            driver.switchTo().window(handler);
            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        //sucessfully switch to the tab
        //now get the text
        WebElement text = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
        System.out.println(text.getText());

        //click on new window button
        driver.switchTo().defaultContent();
        //again need to click on new window
        WebElement window2 = driver.findElement(By.xpath("//*[@id='windowButton']"));
        // at work most probabaly you work with one window or one tab
        driver.quit();



    }
}
