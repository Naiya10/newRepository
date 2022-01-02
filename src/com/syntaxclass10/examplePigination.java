package com.syntaxclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
public class examplePigination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.cssSelector("#btnLogin"));
        login.click();
        WebElement pim = driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b"));
        pim.click();
        WebElement empList = driver.findElement(By.cssSelector("#menu_pim_viewEmployeeList"));
        empList.click();
//          *********************** dealing with table*************************
        //1. get the table and get the rows
        WebElement tableRows = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr"));
        WebElement nxtbtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));

        //2. iterate through the list and look for the required id




    }
}