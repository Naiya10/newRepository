package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        //navigate to syntax checkbox demo and check the first checkbox
      WebElement checkBox= driver.findElement(By.id("isAgeSelected"));
      //checkBox.click();
      Thread.sleep(2000);

      //uncheck
        checkBox.click();

        // check all boxe
       List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
       int size= checkBoxes.size();
       System.out.println(size);

       for(WebElement chckbx:checkBoxes){
           chckbx.click();
           // select the text box with the text option 3
           // get the attribute value
       String getValue = chckbx.getAttribute("value");
           System.out.println(getValue);

           // check only te value option 3
         if(getValue.equalsIgnoreCase("Option-1")){
               chckbx.click();
           }
       }






    }
}
