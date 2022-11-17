package com.krafttechnologie.test.day_12Actions_FileUploat_Jsexector;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class JavaScripExecuter {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void clicWithJs() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/floating_menu");

        WebElement button= driver.findElement(By.linkText("Elemental Selenium"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);"+"arguments[0].click()",button);
        Thread.sleep(2000);

        System.out.println("js.executeScript(\"return document.title;\").toString() = " + js.executeScript("return document.title;").toString());
        System.out.println("js.executeScript(\"return document.URL;\").toString() = " + js.executeScript("return document.URL;").toString());


        String currentWindowhan = driver.getWindowHandle();
        System.out.println("currentWindowhan = " + currentWindowhan);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle : windowHandles) {
            if(!handle.equals(currentWindowhan))
                driver.switchTo().window(handle);

        }
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String expectedUrl="http://elementalselenium.com/";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);


    }

   @Test
   public void test() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement firtName=driver.findElement(By.xpath("(//input[@class='nameFld'])[1]"));
        WebElement lastName=driver.findElement(By.xpath("(//input[@class='nameFld'])[2]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
         Thread.sleep(2000);

        js.executeScript("arguments[0].setAttribute('value', 'Bahar')", firtName);
        js.executeScript("arguments[0].setAttribute('value', 'EREN')", lastName);
   }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.krafttechnologie.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(3000);
    }






}
