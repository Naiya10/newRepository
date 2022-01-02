package com.syntaxclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Webtables {
    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // print a;; the rows of the webtable in the console
        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr"));
        // printimg the size of rows
        System.out.println(tableRows.size());
        // iterator through each webelement to get the txt out of it
        for(WebElement row:tableRows){
            String txt = row.getText();
            System.out.println(txt);
        }
        List<WebElement> col = driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr/td[2]"));
        System.out.println(col.size());
        for(WebElement c:col){
            System.out.println(c.getText());
        }
        List<WebElement> col1 = driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr"));
        System.out.println(col1.size());
        for(WebElement c:col1){
            System.out.println(c.getText());
        }


    }
    //go to the tables/*
    /*
    make sure hat there are seve rows in it
    make sure the text of the first row
    make sure the text of second row is
     */
}
