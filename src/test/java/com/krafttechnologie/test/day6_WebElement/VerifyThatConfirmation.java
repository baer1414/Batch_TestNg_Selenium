package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatConfirmation {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@gmail.com");

        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345");


        WebElement searcBox=driver.findElement(By.xpath("//button[@type='submit']"));

        searcBox.click();

        String expection="Dashboard";
        String actual=driver.findElement(By.tagName("h1")).getText();


        if(expection.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }


        driver.close();




    }
}
