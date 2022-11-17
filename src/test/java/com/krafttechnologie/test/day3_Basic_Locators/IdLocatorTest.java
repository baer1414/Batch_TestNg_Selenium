package com.krafttechnologie.test.day3_Basic_Locators;

import com.github.javafaker.Faker;
import com.krafttechnologie.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        Faker faker =new Faker();



       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://demoqa.com/text-box");
      // driver.manage().window().maximize();

        WebElement inputUserName=driver.findElement(By.id("userName"));
        inputUserName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);

      WebElement inputEmail=driver.findElement(By.id("userEmail"));
      inputEmail.sendKeys(faker.internet().emailAddress());



    }

}
