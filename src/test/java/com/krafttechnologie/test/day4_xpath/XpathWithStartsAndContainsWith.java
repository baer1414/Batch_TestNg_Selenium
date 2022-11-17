package com.krafttechnologie.test.day4_xpath;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathWithStartsAndContainsWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
        WebElement searcbox=driver.findElement(By.xpath("//input[starts-with(@class,'desktopOld')]"));
        searcbox.sendKeys("Samsung Cep Telefonu");

        WebElement searchbtn=driver.findElement(By.xpath("//div[contains(@class,'SearchBoxOld-cH')]"));

        searchbtn.click();
    }
}
