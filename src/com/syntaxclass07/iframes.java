package com.syntaxclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
      //  driver.manage().window().maximize();
        //WebElement days = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        //getting the web element
        //switch to the desired frame as our desired webelement
        driver.switchTo().frame("frame1");
        WebElement text1=  driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text1.getText());
        // to go o another frame we need to switch it to default page
        driver.switchTo().defaultContent();
        //switch to frame 2
        driver.switchTo().frame("frame2");
        WebElement text2= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text2.getText());
        //i can simply locate element as it is not inside the frame



    }
}
