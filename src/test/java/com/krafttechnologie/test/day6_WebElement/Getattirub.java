package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Getattirub {
    public static void main(String[] args) throws InterruptedException {
        String email="mike@gmail.com";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailInputBox=driver.findElement(By.name("email"));
        //emailInputBox.sendKeys("mike@gmail.com");

        Thread.sleep(2000);

        String value=emailInputBox.getAttribute("class");//attribute name of email input
        System.out.println("value = " + value);


        driver.close();

    }
}
