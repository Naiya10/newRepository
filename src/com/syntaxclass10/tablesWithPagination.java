package com.syntaxclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesWithPagination {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //1. locate the table rows using xpath
        //1.2 locate the next button on the table
        WebElement nxtbtn = driver.findElement(By.xpath("//a[@class='page_link']"));

        List<WebElement> tablerows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));

        //2. Iterate over the rows to see if desire row is there or not
        int i=1;
        boolean found=false;
        while(!found) {
            for (WebElement tablerow : tablerows) {
                String textofRow = tablerow.getText();
                if (textofRow.contains("Archy J")) {
                    System.out.println(textofRow);
                    System.out.println(":the page number is : " + i);
                    found=true;
                    break;
                }
            }

            if(!found){
                nxtbtn.click();
                i++;
            }

        }

        }

    }

