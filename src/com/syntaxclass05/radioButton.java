package com.syntaxclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]"));
      //  radiobutton.click();

        // check if radio button is displayed
       boolean isDisplayed =  radiobutton.isDisplayed();
        System.out.println("The raio button is displayed on web page "+ isDisplayed);

        //check if radio button is enabled
      boolean isEnabled =  radiobutton.isEnabled();
        System.out.println("The radio button is Enabled on the webpage "+ isEnabled);

        // check if female radio button is selected
        boolean isSelected = radiobutton.isSelected();
        System.out.println("see if female radio button is selected " + isSelected);

        // Select the female radio button only if its enabled
        if(isEnabled){
            radiobutton.click();
        }
        //after clicking the button print if its selected or not
        isSelected = radiobutton.isSelected();
        System.out.println("see if female radio button is selected " + isSelected);


    }
}
