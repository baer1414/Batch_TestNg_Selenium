package com.krafttechnologie.test.day3_Basic_Locators;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@gmail.com");


        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();

        Thread.sleep(2000);

//verify
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        driver.get("https://the-internet.herokuapp.com/inputs");
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());


        driver.close();

    }
}
