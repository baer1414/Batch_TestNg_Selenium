package com.krafttechnologie.test.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass() {
        System.out.println("before class");
    }

    @Test
    @Ignore//@Ignore yazınca bu test calışmıyor
    public void logout() {
        System.out.println("First Test Case logout");
    }

    @Test
    public void login() {
        System.out.println("Second Test Case login");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method ");
    }

    //@Test  //coment yapınca bu teste calışmadı
    public void comment() {
        System.out.println("Test Case Comment");

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @Test
    public void register() {
        System.out.println("Third test Case reg");
    }


    @AfterClass
    public void tearDownClass() {
        System.out.println("after class");
    }


}
