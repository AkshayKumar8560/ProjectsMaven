package FirstEvalution.Day3_TestNG;

import org.testng.annotations.*;

public class TestNgPart1 {

    // all types of Method

    @BeforeSuite
    void  beforeSuit(){
        System.out.println("1. Before Suit");
    }
    @BeforeTest
    void verifyBeforetest(){
        System.out.println("2. Before Test Method");
    }

    @BeforeClass
    void verifyBeforeClass(){
        System.out.println("3. Before class");
    }
    @BeforeMethod
    void VerifyBeforeMethod(){
        System.out.println("4. before Method");
    }



    @Test
    void VerifyTestMethod(){
        System.out.println("5. this is test Method");
    }
    @Test
    void VerifyTestMethod2(){
        System.out.println(" this is test Method 2");
    }


    @AfterMethod
    void verifyAfterMethod(){
        System.out.println("6. this is After method");
    }
    @AfterClass
    void verifyAfterClass(){
        System.out.println("7. this is After class Method");
    }

    @AfterTest
    void verifyAftertest(){
        System.out.println("8. this is After test Method");
    }




    @AfterSuite
    void verifyAfterSuit(){
        System.out.println("9. this is After Suit method");
    }
}
