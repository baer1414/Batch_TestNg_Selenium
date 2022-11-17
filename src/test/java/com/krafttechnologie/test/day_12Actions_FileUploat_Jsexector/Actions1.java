package com.krafttechnologie.test.day_12Actions_FileUploat_Jsexector;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Actions1 {
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
    public void doubleClick() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement doubleClick= driver.findElement(By.cssSelector("#double-click"));

       Actions actions=new org.openqa.selenium.interactions.Actions(driver);
        Thread.sleep(3000);

        actions.doubleClick(doubleClick).perform();

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement draggable=driver.findElement(By.id("draggable"));

        WebElement droppable=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDrop(draggable,droppable).perform();

//ikinci yol
       // actions.moveToElement(draggable).clickAndHold().moveToElement(droppable).release().perform();

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/javascript/droppable");

        WebElement draggable=driver.findElement(By.id("draggable"));

        WebElement droppable=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDrop(draggable,droppable).perform();

        System.out.println("droppable.getText() = " + droppable.getText());
        String excep="Dropped!";
        Assert.assertEquals(droppable.getText(),excep);
    }


    @Test
    public void hover1() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement howerMe=driver.findElement(By.cssSelector(".dropdown.hover"));
        WebElement link1=driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));

        Actions actions=new Actions(driver);
        actions.moveToElement(howerMe).perform();

        Assert.assertTrue(link1.isDisplayed());

        link1.click();
        Alert alert=driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());

        String actual=alert.getText();
        String excep="Well done you clicked on the link!";

        Assert.assertEquals(actual,excep);

        alert.accept();

        //(//button[@class='dropbtn'])[2]

    }
    @Test
    public void hover2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/components/tooltips");

        WebElement howerMe = driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"));

        WebElement ontop = driver.findElement(By.cssSelector("button[data-bs-placement='top']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(howerMe).perform();

        String excep = "top";
        String actual = ontop.getAttribute("data-bs-placement");
        System.out.println("actual = " + actual);
        Assert.assertEquals(actual, excep);

        List<WebElement> hovers = driver.findElements(By.xpath("//button[@class='btn btn-secondary']"));

        for (WebElement hover : hovers) {
            actions.moveToElement(hover).pause(2000).perform();

        }
    }
        @Test
        public void  rightClick(){
        driver.get("https://demoqa.com/buttons");
        WebElement right=driver.findElement(By.id("rightClickBtn"));
        Actions actions=new Actions(driver);
        actions.contextClick(right).perform();

        WebElement mes=driver.findElement(By.id("rightClickMessage"));

        String excep="You have done a right click";
        String act=mes.getText();

        Assert.assertEquals(act,excep,"Fail");

        }




}
