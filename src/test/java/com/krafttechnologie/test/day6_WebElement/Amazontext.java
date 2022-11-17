package com.krafttechnologie.test.day6_WebElement;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazontext {
    /** Class Task
     *  go to the amazon webpage
     *  write "selenium" to search box
     *  verify that the result of the search
     */
    public static void main(String[] args) throws InterruptedException {

        /** Class Task
         *  go to the amazon website : https://www.amazon.com.tr/
         *  write "selenium" to search box
         *  verify that the result of the search
         */

        String product="apple";


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");


        WebElement cookiesAccept=driver.findElement(By.id("sp-cc-accept"));
        cookiesAccept.click();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(product);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[value='Git']")).click();

        Thread.sleep(1000);

        String actualText=driver.findElement(By.xpath("//span[contains(text(),'Aranan ürün:')]/..")).getText();

        System.out.println("actualText = " + actualText);
        Thread.sleep(1000);

        if (actualText.contains(product)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }


        driver.close();


    }
}
