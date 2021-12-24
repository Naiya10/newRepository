package com.syntaxclass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find the webelemnt dropdown
        WebElement statesDD= driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
      //we can use select class so we will make an obj of select class
        Select select = new Select(statesDD);

        // check if drop down is multiple
        boolean ismult = select.isMultiple();
        System.out.println(ismult);
        select.deselectByIndex(3);
        select.selectByVisibleText("Ohio");
       Thread.sleep(2000);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
       select.deselectAll();

        //to use iterator to get all the options text and print in console
        //get all the options
        List<WebElement> options = select.getOptions();
        Iterator<WebElement> it = options.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getText());
        }





    }
}