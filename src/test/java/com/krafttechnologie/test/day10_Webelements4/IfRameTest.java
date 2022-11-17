package com.krafttechnologie.test.day10_Webelements4;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IfRameTest {
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
    public void iframe() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");



//first id and name
        driver.switchTo().frame("mce_0_ifr");

        WebElement textAres=driver.findElement(By.cssSelector("#tinymce"));
        textAres.clear();
        Thread.sleep(2000);
        textAres.sendKeys("Batch two here");


  //second index
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        textAres.clear();
        Thread.sleep(2000);
        textAres.sendKeys("Batch 2 was here Two time");


 // three web element
        driver.switchTo().parentFrame();
        WebElement fare=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(fare);
        Thread.sleep(2000);
        textAres.sendKeys("Batch 2 Two time");


    }

    @Test
    public void nestedIframe(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

       //switch to middle frame

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        System.out.println("driver.findElement(By.cssSelector(\"#content\")).getText() = " + driver.findElement(By.cssSelector("#content")).getText());


        driver.switchTo().parentFrame();

//        driver.switchTo().defaultContent();//eğer default method kullandıysak yeniden frame top yapmalıyız
//        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-right");

        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = " + driver.findElement(By.tagName("Body")).getText());


        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");

        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = " + driver.findElement(By.tagName("Body")).getText());


    }
















}
