package com.krafttechnologie.test.day10_Webelements4;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void PopUp() throws InterruptedException {
        driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=85671");
        driver.findElement(By.xpath("(//span[text()='Confirm'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("j_idt343:j_idt348")).click();

        Thread.sleep(2000);

        String expectedMessage = "You have accepted";
        WebElement actualMessage = driver.findElement(By.xpath("//p[text()='You have accepted']"));

        Assert.assertEquals(actualMessage.getText(), expectedMessage);

    }

    @Test
    public void PopUp2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//1 switch
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);

        alert.accept();
  //2
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        alert.dismiss();

        //
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);


        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();

//task verify edilecek

    }




}