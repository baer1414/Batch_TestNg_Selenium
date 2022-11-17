package com.krafttechnologie.test.day8_WebElement2;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterSuit {

    @BeforeSuite
    public void beforesuit(){
        System.out.println("Before suit run");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test Run");
    }

    @BeforeClass
            public void beforeclass(){
        System.out.println("Before class run");

    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before Method Run");
    }

    @Test
    public void test1(){
        Assert.assertTrue(4>2);
    }

    @Test
    public void test2(){
        Assert.assertFalse(1>2);
    }

    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("After method run");
    }


    @AfterClass
    public void afterclass(){
        System.out.println("After class");}

    @AfterTest
    public void aftertest(){
        System.out.println("After test run");
    }


    @AfterSuite
    public void aftersuit(){
        System.out.println("After suit run");
    }



}
