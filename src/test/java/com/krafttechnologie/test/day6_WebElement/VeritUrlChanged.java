package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VeritUrlChanged {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        String expectedUrl=driver.getCurrentUrl();

        WebElement emailBox=driver.findElement(By.cssSelector("#email"));
        emailBox.sendKeys("mike@gmail.com");


        WebElement passworBox=driver.findElement(By.name("password"));
        passworBox.sendKeys("12345");

        WebElement searcBox=driver.findElement(By.cssSelector(".btn.btn-primary.w-100"));
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
