package com.krafttechnologie.test.day11_Waits;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicityWaitexample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start>button")).click();

        WebDriverWait wait=new WebDriverWait(driver,15);



        WebElement hello= driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        wait.until(ExpectedConditions.visibilityOf(hello));

        Assert.assertEquals(hello.getText(),"Hello World!");
    }

    @Test
    public void test2(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[text()='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);

        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));


        wait.until(ExpectedConditions.elementToBeClickable(element));


        WebElement mesaj = driver.findElement(By.xpath("//p[@id='message']"));

        Assert.assertEquals(mesaj.getText(), "It's enabled!");




    }
}
