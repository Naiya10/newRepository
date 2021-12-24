package com.syntaxclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        //drive.manage().window().maximize()
        // get the adress of page/window
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        WebElement help = driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a"));
        WebElement privacy = driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[3]/a"));
        WebElement term = driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a"));
        //click on them to open up new windows
        help.click();
        privacy.click();
        term.click();
        // we have not switch the focus so it is still on the main page
        // to get all window handle
        Set<String> windowHandles = driver.getWindowHandles();
        //in order to print all window handles we need to iterate over the SET
        System.out.println(windowHandles.size());
        Iterator<String> it = windowHandles.iterator();
        //iterate through each window handle
        while(it.hasNext()){
            //switch to terms page
            String handle = it.next();
            //now switch to this particular handle/window
            driver.switchTo().window(handle);
            //i need to make sure this is my desire tittle
            String title = driver.getTitle();
            // now put condition
            if(title.equalsIgnoreCase("Google Accunt Help")){
                System.out.println(title);
                break;
            }
        }
        windowHandle=it.next();
        String helpPage = it.next();
        String privacyPage = it.next();
        String termPage = it.next();
        System.out.println(windowHandle);
        System.out.println(helpPage);
        System.out.println(privacyPage);
        System.out.println(termPage);
        driver.switchTo().window(helpPage);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());






    }
}
