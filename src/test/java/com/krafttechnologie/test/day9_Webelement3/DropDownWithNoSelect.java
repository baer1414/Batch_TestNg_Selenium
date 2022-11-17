package com.krafttechnologie.test.day9_Webelement3;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownWithNoSelect {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }



    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement dropdownMenu= driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]"));
        System.out.println("dropdownMenu.getText() = " + dropdownMenu.getText());

        String expectedOption="Select Option";
        String actualOption=dropdownMenu.getText();

        Assert.assertEquals(expectedOption,actualOption,"Fail");

        dropdownMenu.click();

        WebElement group2Option1=driver.findElement(By.cssSelector("#react-select-2-option-1-0"));
        group2Option1.click();

        WebElement selectedOption=driver.findElement(By.cssSelector(".css-1uccc91-singleValue"));

        System.out.println("selectedOption.getText() = " + selectedOption.getText());

       String expecOp="Group 2, option 1";
       String ac=selectedOption.getText();

        Assert.assertEquals(expecOp,ac,"Fail");


    }
}
