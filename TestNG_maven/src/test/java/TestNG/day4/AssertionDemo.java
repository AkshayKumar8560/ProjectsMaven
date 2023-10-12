package TestNG.day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    public static void main(String[] args) {

    }
    @Test
    void test1(){
        //hard assert
        Assert.assertEquals(12,13);
    }
 @Test
    void test2(){

        Assert.assertEquals(12,13,"Not Matched");
    }

    @Test
    void test3(){
        //soft Assert
        Assert.assertEquals("Hello","Hello"," Matched");
    }

}
