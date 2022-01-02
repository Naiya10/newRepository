package com.syntaxclass09;

import com.sun.javafx.UnmodifiableArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the rows of the webtable i the console
        /* after log in

         */
      /*
        for (int i = 1; i < rows.size(); i++) {
          String table = rows.get(i).getText();
            System.out.println(table);
            chechk if row has the product screensaver
            if(row.text.contains("Screensaver){
            driver.findelemnt(By.xpath("");
            
        }
    }

*/
    }
}