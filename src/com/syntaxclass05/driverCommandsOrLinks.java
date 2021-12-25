package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommandsOrLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //go to ebay.com
        driver.get("http://ebay.com/");
        // gt all the links that are there on ebay.com
        // as we have multiple with the tage name so we ue=se driver elements
        // as ther are multiple elemnts so we need to store it in the list
       List<WebElement> links = driver.findElements(By.tagName("a"));

       // print the size of list
        System.out.println("The size of list containing "+links.size());
         // print the text of line
        for(WebElement link:links){

            //get the text out of the web element link
         String  linkText = link.getText();
           System.out.println(linkText);

           // only print the links that have some text and ignore the rest
            if(!linkText.isEmpty()){
                System.out.println(linkText);
                // print all links with text
                //use the method.getAttribute to have value of a particular attribute in the tag
                String linkADress = link.getAttribute("href");
                System.out.println(linkADress);
            }
        }





    }
}
