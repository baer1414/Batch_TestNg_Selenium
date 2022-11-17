package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatUrlNotChanged {
    /** Class Task
     * open the chrome browser
     * go to https://www.krafttechexlab.com/login
     * click on login button
     * verify that url did not changed
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@gmail.com");


        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345");


        String expectedUrl=driver.getCurrentUrl();


        //WebElement searcBox=driver.findElement(By.xpath("//*[.='Login']"));
        WebElement searcBox=driver.findElement(By.xpath("//button[@type='submit']"));
       // WebElement searcBox=driver.findElement(By.cssSelector(".btn.btn-primary.w-100"));

        searcBox.click();

        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }


        driver.close();




    }
}
