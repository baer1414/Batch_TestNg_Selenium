package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassTask {
    public static void main(String[] args) {
        /** Class Task
         *  go to the url -  "https://www.browserstack.com/users/sign_up"
         *  maximize the window
         *  accept cookies if any ,
         *  fill in the blanks with the faker class
         *  click "Term of service" checkbox
         *  and close the window
         *
         *  hint: u can use any locator you want
         *
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.manage().window().maximize();

        WebElement name= driver.findElement(By.xpath("//input[@id='bs-auth-input-fullname']"));
        name.sendKeys("mike yılmaz");

//        WebElement email=driver.findElement(By.cssSelector("#bs-auth-input-email"));
//        email.sendKeys("mike@gmail.com");
    }
}
